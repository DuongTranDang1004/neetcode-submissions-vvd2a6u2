class Solution {
  public boolean checkInclusion(String s1, String s2) {
        //array to compare char frequencies between s1 and s2
        if (s1.length() > s2.length()){
            return false;
        }
        int [] s1CharFreqArray = new int[26];
        int [] s2CharFreqArray = new int[26];
        for (int i = 0; i < s1.length(); i ++){
            s1CharFreqArray[s1.charAt(i) - 'a'] ++;
        }
        int start = 0;

        for (int end = 0; end < s2.length(); end ++  ){
            //expand window : update freChar + 
            s2CharFreqArray[s2.charAt(end) - 'a'] ++;
            //shrink window if length is too much
            if (s1.length() < end - start + 1){
                s2CharFreqArray[s2.charAt(start) - 'a'] --;
            start ++;
            }
            //remember to update state
            if (s1.length() == end - start + 1){
            if (Arrays.equals(s2CharFreqArray, s1CharFreqArray)){
                return true;
            }}
        }
        return false;
    }
}
