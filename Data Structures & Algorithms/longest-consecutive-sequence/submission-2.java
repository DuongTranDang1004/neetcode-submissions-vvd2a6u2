class Solution {
   public int longestConsecutive(int[] nums) {
      if (nums.length == 0){
        return 0;
    }
    int maxLength = 1;
    HashSet<Integer> hashSet = new HashSet<>();
     for (int element: nums){
        hashSet.add(element);
    }
     for (int element: nums){
         if (!hashSet.contains(element-1)){ //valid start 
             int currentLength = 0;
             while (hashSet.contains(element ++)){
                 currentLength ++;
             }
             maxLength = Math.max(maxLength, currentLength);
         }
     }

    //when would startIndex?
    //check if  n-1 exist in set ?
    //while loop => compare wit max length
    return maxLength;
}
   

}
