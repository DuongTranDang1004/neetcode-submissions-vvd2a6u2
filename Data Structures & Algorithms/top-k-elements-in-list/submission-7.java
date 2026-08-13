class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] resultArray = new int[k];
        //freqMap 
        Map<Integer,Integer> freqMap = new HashMap<>();
        //key : num ; value: freq 
        for (int num: nums){
            int currentFreq = freqMap.getOrDefault(num,0);
            freqMap.put(num, currentFreq + 1);
        }
        //bucket 
       ArrayList<Integer> [] bucket = new ArrayList [nums.length +1];
       for (int i =0; i < bucket.length; i ++){
        bucket[i] = new ArrayList<>();
       }
        //map from freqMap to bucket 
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int key = entry.getKey() ; 
            int value = entry.getValue();
            //key : num ; value: freq 
            //bucket: index: freq, arraylist would be num
            bucket[value].add(key);
        }
        //loop from bucket => fill and return result array 
        int addedCount = 0;
        for (int i = bucket.length -1; i >=0; i --){ //outer loop: bucket 
            //inner loop: arrayList
            for (int j =0; j < bucket[i].size(); j ++){
                resultArray[addedCount] =  bucket[i].get(j);
                addedCount ++;
                if (addedCount == k){
                    return resultArray;
                }
            }

        }
        return resultArray;
    }
}
