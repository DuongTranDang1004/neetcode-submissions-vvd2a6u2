class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //resultArray 
        int [] resultArray = new int[k];
                //freqMap 
        Map<Integer,Integer> freqMap = new HashMap<>();
        //key: number, value: freq 

        for (int num: nums){
            int currentFreq = freqMap.getOrDefault(num, 0);
            freqMap.put(num, currentFreq +1);
        }
//bucket
        ArrayList<Integer>[] bucket = new ArrayList[nums.length +1];
        for (int i =0; i < bucket.length; i ++){
            bucket[i] = new ArrayList<>();
        }
        //put freq Map to bucket 
        //index: freq 
        //add to each arraylist of bucket element 

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int key = entry.getKey(); //number value 
            int value = entry.getValue();//freq 
            bucket[value].add(key);
        }

    //loop bucket , fill result aray 
    //loop from n-1 to 0 of bucket
    //and until addedCount = k
    int addedCount = 0;
    
        for (int i = bucket.length -1 ; i >= 0; i --){
            for (int j = 0; j < bucket[i].size(); j ++){
                resultArray[addedCount] =bucket[i].get(j);
                    addedCount ++;
                    if (addedCount == k){
                        return resultArray;
                    }
    
            } 
        }
        return resultArray;

        

    
        
    }
}
