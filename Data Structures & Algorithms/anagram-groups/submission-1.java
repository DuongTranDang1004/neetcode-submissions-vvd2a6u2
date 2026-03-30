class Solution {
  //non optimized approach (sort the array first)
    public List<List<String>> groupAnagrams(String[] strs) {        //loop through each string => sort
        //use sorted result as key
        //add to map
        //return the map
        HashMap<String, List<String>> map = new HashMap<>();
        //sorted string as key , the list of string as values

        for (String s : strs){
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            //create the key if not yet exist
            map.putIfAbsent(key, new ArrayList<>());
            //add value to existing keys
            map.get(key) //get the values (arraylist) by key
                    .add(s); //add string to the array list

        }
        return new ArrayList<>(map.values());
    }

}
