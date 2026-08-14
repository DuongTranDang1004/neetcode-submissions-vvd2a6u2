class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //2 pointer 
        //if okay => return 
        //if smaller => left ++
        //if bigger => right ++
        int leftIndex = 0;
        int rightIndex = numbers.length -1; 
        int [] resultArray = new int[2];
        while (leftIndex < rightIndex){
            int sum = numbers[leftIndex] + numbers[rightIndex];
            if (sum == target){
                 resultArray[0] =leftIndex + 1;
                resultArray[1] = rightIndex + 1;
                // resultArray[0] =numbers[leftIndex];
                // resultArray[1] = numbers[rightIndex];
                return resultArray;
            }
            else if (sum < target){
                        leftIndex ++;
            }else {
                rightIndex --;
            }

        }
        return resultArray;

        
    }
}
