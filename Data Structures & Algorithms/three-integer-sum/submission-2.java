class Solution {
    //brute force: O(N^3)
    //sorting + 2 pointers 
    //i < left < right 
    //duplicate check (compare with the previous)

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length -2 ; i ++){
            //case duplicate i 
            if(i> 0 && nums[i -1] == nums[i]){
                continue;
            }
             //left and right reset based on i
            int left = i + 1;
            int right = nums.length -1;
            while (left<right){
 int sum = nums[i] + nums[left] + nums[right];
            //case equal 
                //add to list
                //move 2 pointer closer
                //skip duplicate at each pointer side 
            if (sum ==0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                resultList.add(list);
                left ++;
                right --;
                //skip duplicates and each end 
                while (left < right && nums[left -1] == nums[left]){
                    left ++;
                }
                while (left < right && nums[right + 1] == nums[right]){
                    right --;
                }
            }else if (sum < 0){
                left ++;
            }else{
                right --;
            }
            }
           
           
        }
        return resultList; 
        
    }
}
