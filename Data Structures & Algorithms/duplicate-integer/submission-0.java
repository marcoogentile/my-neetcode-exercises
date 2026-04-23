class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean duplicated = false; 
        HashSet<Integer> contador = new HashSet<>(); 

        for(int i = 0; i < nums.length && !duplicated; i++){
            if(!contador.contains(nums[i])) contador.add(nums[i]); 
            else{
                duplicated = true; 
            }
        }

        return duplicated; 
    }


}