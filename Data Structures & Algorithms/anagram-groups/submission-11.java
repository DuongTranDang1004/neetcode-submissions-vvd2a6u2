class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //anagram: same char freq 

        //make anagram map 

        //flat to list

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str: strs){
            int [] charFreqArray  = new int[26];
            for (char c: str.toCharArray()){
                charFreqArray[c - 'a']++;
            }
            String charFreqKey = Arrays.toString(charFreqArray);
            if (anagramMap.containsKey(charFreqKey)){
                anagramMap.get(charFreqKey).add(str);
            }else {
                List<String> list  = new ArrayList<>();
                list.add(str);
                anagramMap.put(charFreqKey, list);
            }
        }
        return new ArrayList<>(anagramMap.values());
        
    }

    //time 

    //space 
}
