class MinStack {
    private Stack<Integer> main_stack;
    private Stack<Integer> min_stack;
    public MinStack() {
        main_stack = new Stack<>();
        min_stack = new Stack<>();
    }
    
    public void push(int val) {
        if(main_stack.isEmpty()){
            main_stack.push(val);
            min_stack.push(val);
        }
        else{
            if(min_stack.peek() > val){
                min_stack.push(val);
            }
            else{
                min_stack.push(min_stack.peek());
            }
            main_stack.push(val);
        }
    }
    
    public void pop() {
        main_stack.pop();
        min_stack.pop();
    }
    
    public int top() {
        return main_stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}
