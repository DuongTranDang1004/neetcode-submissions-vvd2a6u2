class Solution {
 public int characterReplacement(String s, int k) {

        int maxLength = 0;
        int start = 0;
        int maxFreqInsideCurrentWindow = 0;
        int [] charFreqInsideCurrentWindowArray = new int[26];
        int currentLength =0;
        char[] charsArray = s.toCharArray();
        for (int end = 0; end < charsArray.length; end ++ ){
            // 1. expand  current window by including chars[end]

            //update the freq Array
            //update the max freq
            charFreqInsideCurrentWindowArray[charsArray[end] - 'A']++;
            maxFreqInsideCurrentWindow = Math.max(maxFreqInsideCurrentWindow, charFreqInsideCurrentWindowArray[charsArray[end] - 'A']);
            //2. check if current window is still valid
            //windowSize ?
            int windowSize = end - start + 1;
            //number of replacement possibles within window < number of replacement allowed
            //3.Shrinking current window if not valid (no replacement possbile or allowed)
            //update freq array
            //update start
            if (windowSize - maxFreqInsideCurrentWindow > k){
                charFreqInsideCurrentWindowArray[charsArray[start] - 'A']--;
                start ++;
                // recompute maxFreq from scratch after shrinking
                maxFreqInsideCurrentWindow = 0;
//                for (int freq : charFreqInsideCurrentWindowArray) {
//                    maxFreqInsideCurrentWindow = Math.max(maxFreqInsideCurrentWindow, freq);
//                }
            }



            //calculate max length after each for loop interation
           // maxLength = Math.max(windowSize, maxLength);
            maxLength = Math.max(end - start + 1, maxLength);


        }
        return maxLength;
    }
}

