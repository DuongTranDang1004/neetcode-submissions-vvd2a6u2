class Solution {
      public  int maxArea(int[] heights) { //this is for submission
        int n = heights.length;
        int left = 0;
        int right = n  -1;
        int maxArea = 0;

        while (left < right){ //do we need extra condition check here ? 
            //need to compare current area as well (BothExpandedArea)
            int currentArea = (right- left) * Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea,currentArea);
            //try to move in the smaller side 
            if (heights[left] < heights[right]){
            left ++ ;
            }else {
                right --;
            }
        }
          
        return maxArea;
    }
}
