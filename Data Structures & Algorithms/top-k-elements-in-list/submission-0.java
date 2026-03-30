class Solution {
      public int[] topKFrequent(int[] nums, int k) {
        // Step 1: count frequencies
        HashMap<Integer, Integer> frequenciesMap = new HashMap<>();
        for (int n : nums) {
            if (frequenciesMap.containsKey(n)) {
                int currentCount = frequenciesMap.get(n);
                frequenciesMap.put(n, currentCount + 1);   // seen before → increment
            } else {
                frequenciesMap.put(n, 1);                  // first time seeing n → start at 1
            }
        }

        // Step 2: create n buckets (index = frequency)
        // bucket[i] holds LIST OF all numbers that appear exactly i times
        List<Integer> [] bucket = new List[nums.length + 1]; //why + 1: frequency is 1 based
        for (int i = 0; i < bucket.length; i ++){
            bucket[i] = new ArrayList<>();
        }
        //put number into bucket based on their frequencies
        for (Map.Entry<Integer, Integer> entry : frequenciesMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            bucket[value].add(key);
        }


        // Step 3: collect top k — scan from high freq to low
        List<Integer> resultList = new ArrayList<>();
        for (int freq = bucket.length -1; freq >= 1; freq -- ){
            resultList.addAll(bucket[freq]);
            if (resultList.size()  >= k){
                break;
            }
        }
        int [] resultArray = new int[resultList.size()];
        for (int i =0; i < resultList.size(); i ++){
            resultArray[i] = resultList.get(i);
        }

        return  resultArray;
    }
}
