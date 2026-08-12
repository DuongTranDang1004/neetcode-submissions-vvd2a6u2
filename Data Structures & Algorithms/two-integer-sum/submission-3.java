class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] resultArray = new int[2];
        ///nums :  1 2 3 4 , target 5
        Map<Integer,Integer> map = new HashMap<>();
        // < index, needed>
        for (int i = 0; i < nums.length; i ++){
            int needed = target - nums[i];
            if (map.containsValue(nums[i])){
                resultArray[1] = i;
            }
            map.put(i, needed);
        }

      for (Map.Entry<Integer,Integer> entry : map.entrySet()){
       int  key = entry.getKey();
       int  value = entry.getValue();
        if (value == nums[resultArray[1]] && key!= resultArray[1]){
            resultArray[0] = key;
        }
      }

        return resultArray;

    }
    //any better solution ? 
}
