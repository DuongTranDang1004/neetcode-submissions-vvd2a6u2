class Solution {
       //wait until warmer
    public int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
        Stack<Integer> indicesStack = new Stack<>();
        int [] results = new int[n];

        for (int i =0;i < n; i ++ ){
            while (!indicesStack.isEmpty() && temperatures[i] > temperatures[indicesStack.peek()]){ //have seen warmer
                int waitingIndex = indicesStack.pop();
                results[waitingIndex] = i - waitingIndex;
            }
            //  still wait for warmer
            indicesStack.push(i);
        }
return results;
    }
}
