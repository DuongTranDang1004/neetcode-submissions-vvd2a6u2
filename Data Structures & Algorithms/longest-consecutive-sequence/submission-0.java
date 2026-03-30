class Solution {
     public int longestConsecutive(int[] nums) {
    int maxLength = 0;
    HashSet<Integer> hashSet = new HashSet<>();
    for (int element: nums){
        hashSet.add(element);
    }
    for (int i = 0; i < nums.length; i ++ ){
        int checkingNumber = nums[i];
        if ( !hashSet.contains(checkingNumber -1)){ //valid start
             int currentLength = 1;
                 while (hashSet.contains(checkingNumber + currentLength)){
                     currentLength ++;
                 }
            maxLength = Math.max(currentLength,maxLength);
        }
             }

        return maxLength;
    }

}
