class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int N = s.length();
        char [] chararray1= s.toCharArray();
        char [] chararray2= t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i =0; i < N; i ++){
            int currentSCount = map1.getOrDefault(chararray1[i],0);
            map1.put(chararray1[i],currentSCount + 1 );
               int currentTCount = map2.getOrDefault(chararray2[i],0);
            map2.put(chararray2[i],currentTCount + 1 );

        }
        for (Map.Entry<Character,Integer> entry : map1.entrySet()){
            if ( ! map1.get(entry.getKey()).equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;


    }
}
