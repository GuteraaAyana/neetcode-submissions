class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int num_days = 0;
            boolean found = false;
            for(int j = i; j< temperatures.length; j++){
                if(temperatures[i] < temperatures[j]){
                    arr[i] = num_days;
                    found = true;
                    break;
                }
                num_days++;
            }
            if(!found) arr[i] = 0;
        }
        return arr;
    }
}
