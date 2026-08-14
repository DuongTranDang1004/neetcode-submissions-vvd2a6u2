class Solution {

    //2 pointers until meet
    //ON time, O1 space 
    public boolean isPalindrome(String s) {
        //need string builder to filt, remove non alpha 
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if (Character.isLetter(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        String resultString = sb.toString().toLowerCase();
        char [] charArray = resultString.toCharArray();
        int leftIndex = 0;
        int rightIndex = charArray.length -1;
        while (leftIndex < rightIndex){
            if (charArray[leftIndex] != charArray[rightIndex]){
                return false;
            }
            leftIndex ++;
            rightIndex --;
        }
        return true; //passed all check 
        
    }
}
