class MinStack {
    private Stack<Integer> stack;
    int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if (val < min){
            min = val;
        }
    }
    
    public void pop() {
        stack.pop();

        min = Integer.MAX_VALUE;
        for (int val : stack){
            if (val < min){
                min = val;
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
