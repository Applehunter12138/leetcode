package package1;

import java.util.Stack;

public class Solution {
    Stack<Integer> data;
    Stack<Integer> minNumber;

    public Solution() {
        this.data = new Stack<>();
        this.minNumber = new Stack<>();
    }

    public void push(int val) {
        data.push(val);

        if(minNumber.isEmpty()) {
            minNumber.push(val);
        }
        else {
            if(val < minNumber.peek()){
                minNumber.push(val);
            }
            else {
                minNumber.push(minNumber.peek());
            }
        }
    }

    public void pop() {
        data.pop();
        minNumber.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minNumber.peek();
    }
}
