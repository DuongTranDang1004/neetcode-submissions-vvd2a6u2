class Solution {
      public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int element : nums){
            if (hashSet.contains(element)){
                return true;
            }
            hashSet.add(element);
        }
        return false;
    }
}