class Solution {

    //sliding window 
    //if duplicate => shrink start (use set to track)
    //else: try to expand end 
    //update max length 
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        for(int end = 0; end < s.length(); end ++){
            while (set.contains(s.charAt(end))){ //why need while here? is 1 if enough? 
                set.remove(s.charAt(start));
                start ++;
                
            }
                set.add(s.charAt(end));
                int currentLength = end - start + 1; //do I need to plus 1? 
                maxLength = Math.max(maxLength, currentLength);

            
        }
        return maxLength; 
    }
}
