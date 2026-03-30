class Solution {
      public int[] twoSum(int[] nums, int target) {
      ;
            //store hash map of  diff
            HashMap<Integer, Integer> diffToTargetAtIndexMap = new HashMap<>();

            //loop thorugh array, cal currentDiff, check with seenDiffAtIndex hashmap
            for (int i = 0; i < nums.length; i ++){
                int currentDiff = target - nums[i];
                if (diffToTargetAtIndexMap.containsKey(currentDiff)){
                    //if already seen
                    //return that index + currentIndex
                    return   new int[]{diffToTargetAtIndexMap.get(currentDiff), i};
                }
                //else: if has not seen
                diffToTargetAtIndexMap.put(nums[i], i);
            }
            return null;
        }
}
