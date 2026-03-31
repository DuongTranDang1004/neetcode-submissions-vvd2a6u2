class Solution {
      public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] results = new int[n];
        //store stack: waiting temps index
        Stack<Integer> waitingTemperatureIndexStack = new Stack<>();
        for (int i = 0; i < n ; i ++) {
            //stack not empty
            while (!waitingTemperatureIndexStack.isEmpty() && temperatures[i] > temperatures[waitingTemperatureIndexStack.peek()]   ) { //meet warmer day
                         int waitDaysCount =   i - waitingTemperatureIndexStack.peek();
                results[ waitingTemperatureIndexStack.peek()] = waitDaysCount;
                waitingTemperatureIndexStack.pop();
            }
            waitingTemperatureIndexStack.push(i);


        }
        return  results;
    }

       
}
