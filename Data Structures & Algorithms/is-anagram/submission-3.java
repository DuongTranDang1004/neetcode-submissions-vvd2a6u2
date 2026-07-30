class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int N = s.length();
         char [] chararrayS= s.toCharArray();
        char [] chararrayT= t.toCharArray();


        // HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();

        int[] freqCharS = new int[26];
             int[] freqCharT = new int[26];
               for (int i =0; i < N; i ++){
                char currentSChar = chararrayS[i];
                int currentSIndex = currentSChar - 'a';
                freqCharS[currentSIndex] ++;

               char currentTChar = chararrayT[i];
                int currentTIndex = currentTChar - 'a';
                freqCharT[currentTIndex] ++;

               }
               
               for (int i = 0; i < freqCharS.length; i ++){
                if (freqCharS[i] != freqCharT[i]){
                    return false;
                }
               }
               return true;
        // for (int i =0; i < N; i ++){
        //     int currentSCount = map1.getOrDefault(chararray1[i],0);
        //     map1.put(chararray1[i],currentSCount + 1 );
        //        int currentTCount = map2.getOrDefault(chararray2[i],0);
        //     map2.put(chararray2[i],currentTCount + 1 );

        // }
        // for (Map.Entry<Character,Integer> entry : map1.entrySet()){
        //     if ( ! map1.get(entry.getKey()).equals(map2.get(entry.getKey()))) {
        //         return false;
        //     }
        // }
        // return true;


    }
}
