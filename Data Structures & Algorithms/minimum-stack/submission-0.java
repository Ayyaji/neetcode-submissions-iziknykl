class MinStack {
    private int[] s;       // stack for all values
    private int[] min;     // stack for current minimums
    private int top;       // index of top element

    public MinStack() {
        s   = new int[10000]; // or dynamic structure
        min = new int[10000];
        top = -1;
    }

    public void push(int val) {
        top++;
        s[top] = val;

        if (top == 0) {
            min[top] = val;                // first element is min
        } else {
            min[top] = Math.min(val, min[top - 1]);
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
        }
    }

    public int top() {
        if (top >= 0) return s[top];
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (top >= 0) return min[top];
        throw new RuntimeException("Stack is empty");
    }
}
