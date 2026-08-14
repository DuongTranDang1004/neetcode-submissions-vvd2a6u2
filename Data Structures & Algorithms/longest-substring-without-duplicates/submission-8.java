class Solution {
    //sliding window 
    //if duplicate => shrink left  (track current duplicate via set)
    //else: increase right 
    //update max length 

    public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int left =0;
            Set<Character> set = new HashSet<>();
            for (int right =0; right < s.length(); right ++){
                 char currentChar = s.charAt(right);
                 while (set.contains(currentChar)){
                    set.remove(s.charAt(left));
                    left ++;
                }
               
                set.add(currentChar);
                int currentLength = right - left + 1; 
                maxLength = Math.max(maxLength, currentLength);
               
            }
            return maxLength;
    }
}
