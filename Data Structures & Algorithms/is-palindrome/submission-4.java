class Solution {
      public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        int n=s1.length();
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s1.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s1.charAt(j))){
                j--;
            }
            if( s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}