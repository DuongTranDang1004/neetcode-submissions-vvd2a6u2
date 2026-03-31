class Solution {
     public int[] topKFrequent(int[] nums, int k) {
    //count frequencies in map
    HashMap<Integer, Integer> frequenciesMap = new HashMap<>();
    for (int element: nums){
        if (frequenciesMap.containsKey(element)){
            frequenciesMap.put(element,
                    frequenciesMap.get(element) + 1
            );
        }
        else {
            frequenciesMap.putIfAbsent(element,1);
        }


    }

    //create buckets => put number into correct bucket
    //create an array, each array element is a list of integer
     ArrayList<Integer>[] bucket = new ArrayList[nums.length +1];
    for (int i = 0; i < bucket.length; i ++){
        bucket[i] = new ArrayList<>();
    }
    for (Map.Entry<Integer, Integer> entry : frequenciesMap.entrySet()){
        Integer key = entry.getKey();
        Integer value = entry.getValue();
        bucket[value].add(key);
    }
    //return top k

    int [] resultArray = new int[k];
    int resultArrayIndex = 0;
    for (int freq = bucket.length -1; freq >= 1 && resultArrayIndex < resultArray.length; freq --){
        for (int num : bucket[freq] ){
            resultArray[resultArrayIndex ++] = num;
            if (resultArrayIndex == k){
                break;
            }
        }
    }
    return resultArray;

}
}
