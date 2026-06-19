class MinStack {

    Stack<Integer> stack;
    Stack<Integer> MinStack;

    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (MinStack.isEmpty()){
            MinStack.push(val);
        }
        else{
            MinStack.push(Math.min(val,MinStack.peek()));
        }
    }
    
    public void pop() {
        System.out.println("Popping element at top");
        stack.pop();
        MinStack.pop();
    }
    
    public int top() {
        System.out.println("Top element is below : ");
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
        
    }
}
