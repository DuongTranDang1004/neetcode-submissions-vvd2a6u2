class Solution {
    public int[] productExceptSelf(int[] nums) {
    //does not include i
    //prefix
    int [] prefixProducts = new int[nums.length ];
    prefixProducts[0] = 1;
    for (int i = 1; i < nums.length; i ++){
        prefixProducts[i] = prefixProducts[i-1] * nums[i -1];
    }
    //suffix
    int [] suffixProducts = new int[nums.length];
    suffixProducts[nums.length -1] = 1;
    for (int i = nums.length -2; i >= 0; i --){
        suffixProducts[i] = suffixProducts[i+1] * nums[i +1];
    }

    //times together
    int [] results = new int[nums.length];
    for (int i = 0; i < nums.length; i ++){
        results[i] = suffixProducts[i] * prefixProducts[i];
    }
    return results;
}
}