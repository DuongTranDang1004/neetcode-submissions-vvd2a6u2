class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int [] charFreqS1 = new int[26];
        for (char c: s1.toCharArray()){
            charFreqS1[c - 'a']++;
        }
        int [] charFreqS2Window = new int[26];
        int start =0;
        for (int end =0; end < s2.length(); end ++){
            charFreqS2Window[s2.charAt(end) - 'a']++;
            int currentWindowSize = end - start +1;
            if ( s1.length() < currentWindowSize ){ //size too big
                charFreqS2Window[s2.charAt(start) - 'a']--;
                start ++;
            }
            if (s1.length() == end - start + 1){ //recompute to re update the state after shrinking 
                if (Arrays.equals(charFreqS1,charFreqS2Window )){
                    return true;
                }
            }
        }
        return false;
    }
}
