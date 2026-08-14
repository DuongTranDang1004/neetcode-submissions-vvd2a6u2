class Solution {
    //no duplicate 
    //distinct index
    //return the triplet values 

    //bruteforce might be N^3

    //has the input beensorted? we might need to sort => 2 pointers 
    //i < left < right 

    //how to : no duplicate tripplet? does the 2 pointers approach handle them by default? or any extra handling ? 
    //maybe extrad handling //make examples 

    //dupcate check: compare with the previous, not the next

    //-1,-1,-1,-1, 0, 3, 4
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
       
        for (int i = 0; i <= nums.length -2; i ++){
            //skip duplicate for i
            if (i > 0 && nums[i-1] == nums[i]){
                continue;
            }
             int left = i + 1;
        int right = nums.length -1;
            while (left < right){
                    int currentSum = nums[left] + nums[i] + nums[right];
                    if (currentSum == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[left]);
                        list.add(nums[i]);
                        list.add(nums[right]);
                        resultList.add(list);
                        left ++;
                        right --;
                        //remove duplicate 
                    while (left < right && nums[left -1] == nums[left]){
                        left ++;
                    }
                    while (left < right && nums[right +1] == nums[right]){
                        right --;
                    }
                    }else if (currentSum < 0){
                        left ++;
                    }else {
                        right --;
                    }
                    
            }
                
        }
        return resultList;
        
    }

    //time and space complexity ?
    //include the sort  
}
