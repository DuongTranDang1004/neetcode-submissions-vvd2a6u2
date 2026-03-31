class Solution {
 public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int maxFreq = 0; //max freq within current window. (replacement possible = windowSize = maxFreq) 
        int []freqCount = new int[26]; //freq count within current window
        int start = 0; 
        char[] charArray = s.toCharArray();
        for (int end = 0; end < charArray.length; end ++){
            //expand 
            char endCharOfWindow = charArray[end];
            //update freqCount
            freqCount[endCharOfWindow - 'A']++;
            //update maxFreq
            maxFreq = Math.max(maxFreq,  freqCount[endCharOfWindow - 'A']);
            int windowSize = end - start + 1; //state before shrinking 
            int possibleReplacementInWindow = windowSize - maxFreq;

            //shrink
            if (possibleReplacementInWindow > k){ //if possible > allowed
                //update freqCount
                char startCharOfWindow = charArray[start];
freqCount[startCharOfWindow - 'A'] --;
                start ++;
                //no need to update maxFreq cause we are only decreasing, no increasing here 
            }
            
            
            //calculation
            //calculation
             windowSize = end - start + 1; //update state after shrinking
            maxLength = Math.max(maxFreq, windowSize);
        }
        return maxLength;

    }
}

