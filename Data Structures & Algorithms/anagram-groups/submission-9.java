class Solution {
  //non optimized approach (sort the array first)
  //store array of char count 26 as keys to group together in a map
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs){
        int [] charsCount = new int[26];
        for (char c: s.toCharArray()){
            charsCount[c - 'a']++;
        }
        //convert char count to String key
            String key = Arrays.toString(charsCount);
            //put in the result list
            map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(s);
        //return
    }
return new ArrayList<>(map.values());
    }
}
