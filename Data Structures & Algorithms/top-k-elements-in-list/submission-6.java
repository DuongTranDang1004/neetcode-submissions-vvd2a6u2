class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] resultArray = new int[k];
//freq map 
Map<Integer, Integer> freqMap = new HashMap<>();
//key: num, value: freq 
for (int num : nums){
    int currentFreq = freqMap.getOrDefault(num, 0);
    freqMap.put(num, currentFreq + 1);
}

//bucket initilization 
ArrayList<Integer> [] bucket = new ArrayList [nums.length + 1];
for (int i =0; i < bucket.length; i ++){
    bucket [i] = new ArrayList<>();
}

//map from freq map to bucket 
for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
    int key = entry.getKey(); // num
    int value = entry.getValue(); //freq 
    //bucket: index = freq, element: araylist of nums that statisfy index freq 
    bucket[value].add(key);
}
//loop from bucket, fill the result array 

int addedCount = 0;
for (int i = bucket.length -1; i >= 0; i --){ //loop from top down of bucket 
    // loop the arraylist 
    for (int j = 0; j < bucket[i].size(); j ++){
    if (addedCount == k){
            return resultArray;
        }
        
        resultArray[addedCount] = bucket[i].get(j);
        addedCount ++;
        
        
    }
}
return resultArray;


        
        
    }
}
