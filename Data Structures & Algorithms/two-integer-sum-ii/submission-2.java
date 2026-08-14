class Solution {
    //input array is sorted
    //2 pointers
    //1-based index (conversion)

    public int[] twoSum(int[] numbers, int target) {
        int[] resultArray = new int[2];
        int left = 0;
        int right = numbers.length -1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                resultArray[0] = left +1;
                resultArray[1] = right + 1;
                return resultArray;
            }else if(sum < target){
                left ++;
            }else {
                right --;
            }
        }
        return resultArray;
    
    }
}
