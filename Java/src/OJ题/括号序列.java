package OJ题;

import java.util.Stack;

/**
 * @Author Meng Xin
 * @Date 2020/8/27 7:18
 */
public class 括号序列 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' || stack.size() == 0) {
                stack.push(s.charAt(i));
            } else {
                char peek = stack.peek();
                if (s.charAt(i) == ')') {
                    if (peek == '(')
                        stack.pop();
                    else
                        return false;
                    continue;
                }
                if (s.charAt(i) == '}') {
                    if (peek == '{')
                        stack.pop();
                    else
                        return false;
                    continue;
                }
                if (s.charAt(i) == ']') {
                    if (peek == '[')
                        stack.pop();
                    else
                        return false;
                    continue;
                }
                stack.push(peek);
            }
        }
        return stack.size() == 0;
    }
}
