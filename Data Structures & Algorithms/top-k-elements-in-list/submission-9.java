class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int [] resultArray = new int[k];
        //freqMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        //key : num -> val: freq 
        for (int num: nums){
            int currentFreq = freqMap.getOrDefault(num,0);
            freqMap.put(num, currentFreq +1);
        }

        //bucket 

       ArrayList<Integer> [] bucket = new ArrayList[nums.length +1];
       //index: freq [0, n]
       //value: list of num that statisfy index freq
       for(int i =0; i < bucket.length; i ++){
        bucket[i] = new ArrayList<>();
       }

       //put from map to bucket 
       for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
        int numKey = entry.getKey();
        int freqVal = entry.getValue();
        bucket[freqVal].add(numKey);
       }

        //loop n to 0 in bucket => answer 
        int addedCount = 0; //must <= k
        for (int i = bucket.length -1; i >= 0; i -- ){ //outer loop: bucket 
            for (int j = 0; j < bucket[i].size(); j ++){ //inner loop: arraylist
               resultArray[addedCount] = bucket[i].get(j);
               addedCount ++;
               if (addedCount == k){
                return resultArray;
               }

        }
        }
        return resultArray;
        
    }
}
