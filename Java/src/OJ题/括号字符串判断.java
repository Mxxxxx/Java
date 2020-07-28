package OJ题;

import java.util.Stack;

/**
 * @Author Meng Xin
 * @Date 2020/7/28 8:08
 */
public class 括号字符串判断 {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            } else {
                return false;
            }
        }
        if (!stack.empty()) {
            return false;
        } else {
            return true;
        }
    }
}
