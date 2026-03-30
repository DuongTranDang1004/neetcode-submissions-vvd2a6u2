class Solution {
     //hashmap? <Char,Number of occurance >
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstStringOccurrence = new HashMap<>();
        HashMap<Character, Integer> secondStringOccurrence = new HashMap<>();
        char [] firstCharArray = s.toCharArray();
        char [] secondCharArray = t.toCharArray();
        for (char c : firstCharArray){
            if (firstStringOccurrence.containsKey(c)){
                firstStringOccurrence.put(c, firstStringOccurrence.get(c) + 1);
            }else {
                firstStringOccurrence.put(c, 1);
            }
        }
        for (char c : secondCharArray){
            if (secondStringOccurrence.containsKey(c)){
                secondStringOccurrence.put(c, secondStringOccurrence.get(c) + 1);
            }else {
                secondStringOccurrence.put(c, 1);
            }
        }

        if (firstStringOccurrence.equals(secondStringOccurrence)){
            return true;
        }else {
            return false;
        }
        //what if 2 strings has different length? 
        //what if second string has more chars than first string? 
        //(ex: string 2 has everything string 1 has, but some things that string 2 has does not included in string 1

    }
}
