class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> letrasS = new HashMap<>(); 
        HashMap<Character, Integer> letrasT = new HashMap<>(); 

        for(int i = 0; i<s.length(); i++){
            if(!(letrasS.containsKey(s.charAt(i)))){
                letrasS.put(s.charAt(i), 1); 
            }else{
                letrasS.put(s.charAt(i), letrasS.get(s.charAt(i))+1);
            }
        }

        for(int i = 0; i<t.length(); i++){
            if(!(letrasT.containsKey(t.charAt(i)))){
                letrasT.put(t.charAt(i), 1); 
            }else{
                letrasT.put(t.charAt(i), letrasT.get(t.charAt(i))+1);
            }
        }

        for (Map.Entry<Character, Integer> elemS : letrasS.entrySet()) {
            char c = elemS.getKey();
            int freq = elemS.getValue();

            if (!letrasT.containsKey(c)) return false;

            if (!letrasT.get(c).equals(freq)) return false;
        }

        for (Map.Entry<Character, Integer> elemT : letrasT.entrySet()) {
            char c = elemT.getKey();
            int freq = elemT.getValue();

            if (!letrasS.containsKey(c)) return false;

            if (!letrasS.get(c).equals(freq)) return false;
        }

        return true; 
    }
}
