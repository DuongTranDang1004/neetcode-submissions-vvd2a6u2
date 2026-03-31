class Solution {
        public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String s2 = sb.toString().toLowerCase();
        char [] chars = s2.toCharArray();
    for (int left = 0; left  <  chars.length / 2; left ++){
        int right = chars.length - 1 - left;
        if (chars[right] != chars[left]){
            return false;
        }
    }
    return true;
    }

}