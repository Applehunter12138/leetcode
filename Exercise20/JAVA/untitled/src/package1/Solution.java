package package1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    String inputString;

    public Solution(String inputString) {
        this.inputString = inputString;
    }

    public boolean isValid() {
        if(inputString.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> leftBrackets = new Stack<>();
        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(pairs.containsKey(ch)) {
                if(leftBrackets.isEmpty() || leftBrackets.peek() != pairs.get(ch)) {
                    return false;
                }
                leftBrackets.pop();
            } else {
                leftBrackets.push(ch);
            }
        }

        return leftBrackets.isEmpty();
    }
}
