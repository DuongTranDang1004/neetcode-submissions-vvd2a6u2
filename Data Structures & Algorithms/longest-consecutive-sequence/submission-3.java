class Solution {
    //duplicate does not count => use set is okay 
    //find the valid start? 
    //n-1 does not exist 
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            set.add(num);
        }

        for(int num: set){
            if (!set.contains(num-1)){//valid start
                int currentLength = 1;
                int currentLoopValue = num;
                while (set.contains(currentLoopValue +1)){
                    currentLength++;
                    currentLoopValue ++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
        
    }
}
