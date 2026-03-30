class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int left = 0; left < s.length()/2; left ++ ){
            int right = s.length() - 1 - left;
            if (s.toCharArray()[left] != s.toCharArray()[right]){
                return false;
            }
        }
        return true;
    }
}