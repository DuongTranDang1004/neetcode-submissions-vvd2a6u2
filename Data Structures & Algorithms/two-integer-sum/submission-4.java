class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] resultArray = new int[2];
        //nums 1 2 3 4  , target = 5 
        Map<Integer,Integer> map = new HashMap<>();
        //key: number value, value: index 
        for (int i =0; i < nums.length; i++){
            int currentNeed = target  - nums[i];
            if (map.containsKey(currentNeed)){
                resultArray[0] = map.get(currentNeed);
                resultArray[1] = i;
                return resultArray;
            }
            map.put(nums[i], i);
        }
        return resultArray;
    }
}
