class Solution {
      public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
    char [] charsArray = s.toCharArray();
        int maxLength = 1;
        int start = 0;
        Set<Character> characterSet = new HashSet<>();
        characterSet.add(charsArray[start]);

        for (int end =1; end < charsArray.length; end++ ){

            while (characterSet.contains(charsArray[end])){ //duplicate found
                //track new set 
                characterSet.remove(charsArray[start]);
                start ++; 
           //break;
            }
                characterSet.add(charsArray[end]);
                int currentLength = end- start + 1;
                maxLength = Math.max(maxLength, currentLength);


            }
        return maxLength;
    }

}
