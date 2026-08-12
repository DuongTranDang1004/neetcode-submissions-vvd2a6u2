class Solution {
    public boolean isAnagram(String s, String t) {
//track the frequencies of character => compare them 

if (s.length() != t.length()){
    return false;
}
int N = s.length(); 
int [] charFreqArrayS = new int[26];
int [] charFreqArrayT = new int[26];

for (int i =0; i < N; i ++){
    char currentCharS = s.charAt(i);
    charFreqArrayS[currentCharS - 'a'] ++;

     char currentCharT = t.charAt(i);
       charFreqArrayT[currentCharT - 'a'] ++;
}

for (int i =0; i < 26; i ++){
    if(charFreqArrayS[i] != charFreqArrayT[i] ){
        return false;
    }
}
return true;



    }
}
