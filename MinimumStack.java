class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty() && mins.isEmpty()){
            stack.push(val);
            mins.push(val);
        }
        else{
            stack.push(val);
            if (val <= mins.peek()){
                mins.push(val);
            }
        }
    }
    
    public void pop() {
        int val = stack.pop();
        if (mins.peek() == val){
            mins.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
