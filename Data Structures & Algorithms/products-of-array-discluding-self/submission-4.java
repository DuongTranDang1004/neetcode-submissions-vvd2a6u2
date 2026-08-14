class Solution {

    //all leff * all right (exlude split pointer)
    public int[] productExceptSelf(int[] nums) {
        int [] resultArray = new int[nums.length]; 

        //first loop :left product 
        int leftProduct =1; 
        for (int i =0; i < nums.length; i ++){
            resultArray[i] = leftProduct; 
            leftProduct = leftProduct * nums[i];
        
        }

        //second loop: right product 
        int rightProduct = 1;
        for (int i = nums.length -1; i >=0 ; i --){
            resultArray[i] *= rightProduct; //keep the result from 1st loop, dont reset
            rightProduct *= nums[i];
        }

        //return the result array 
        return resultArray;
    }
}  
