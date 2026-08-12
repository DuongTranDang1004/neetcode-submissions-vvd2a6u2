class Solution {
    public boolean hasDuplicate(int[] nums) {

        //set? 
       Set<Integer> set = new HashSet<>();
       for (int num:nums){
        if (set.contains(num)){
            return true;
        }
        set.add(num);
       }
       return false;
        
    }
}