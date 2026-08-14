class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //anagrams: same freq char count 

        //put to map of anagrams 
        //collect map key => put to list 

        List<List<String>> resultList  = new ArrayList<>();

        Map<String,List<String>> anagramMap = new HashMap<>();
        

        for (String str: strs){
            int [] charFreq = new int[26];
            for (char c: str.toCharArray()){
                charFreq[c-'a']++;
            }
            String charFreqKey = Arrays.toString(charFreq);
            if (anagramMap.containsKey(charFreqKey)){
                anagramMap.get(charFreqKey).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                anagramMap.put(charFreqKey, list);
            }
        }
    
        


        return new ArrayList<>(anagramMap.values());
        
    }
}
