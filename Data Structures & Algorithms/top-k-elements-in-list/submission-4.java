class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //structure : 
        //bucket freq => map with list of nums satisfy that frequencies
        //loop from n to 1 => return top k 
        Map<Integer,Integer> freqMap = new HashMap<>();
        //key: num, values: freq
       
         for (int num : nums) {
            freqMap.put(
                num,
                freqMap.getOrDefault(num, 0) + 1
            );
        }

        //make the bucket 
        //the whole bucket would be an array 
        //each array index = freq 
        //each array element  => a list  of number that satisfy that freq
        //max freq <= nums.length 
        //freq start from 0
         List<Integer> [] bucket = new ArrayList[nums.length + 1];
         for (int i = 0; i < bucket.length; i++) {
    bucket[i] = new ArrayList<>();
}

         //fill the bucket based on freqMap 
        
         for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();       // number
            int value = entry.getValue();   // frequency

            bucket[value].add(key);
        }
                 int [] resultArray = new int[k];
         //loop the bucket to fill the result array
         int addedElementCount = 0; // <= k
         for (int i = bucket.length -1 ; i >= 0; i --){
            for (int j = 0; j < bucket[i].size() ; j ++){
                resultArray[addedElementCount] = bucket[i].get(j);
                addedElementCount ++;

                if (addedElementCount == k) {
                    return resultArray;
                }
            }
         }




        return resultArray; 
    }
}
