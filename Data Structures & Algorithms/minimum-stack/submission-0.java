class MinStack {
    Vector<Integer> stack = new Vector<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        int smallest = stack.get(0);

        for (Integer iter: stack) {
            if (iter < smallest) {
                smallest = iter;
            }
        } 

        return smallest;
    }
}
