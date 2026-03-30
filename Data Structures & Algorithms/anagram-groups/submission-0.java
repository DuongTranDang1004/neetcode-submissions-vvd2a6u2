class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //object for result
       Map<String,List<String>>  resultMap = new HashMap<>();
//convert to char array to sort
        //
        for (String s : strs){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            resultMap.putIfAbsent(key, new ArrayList<>());
            resultMap.get(key).add(s);

        }
       // return (List<List<String>>) resultMap;
        return new ArrayList<>(resultMap.values());
    }

}
