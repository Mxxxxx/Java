package OJ题;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author Meng Xin
 * @Date 2020/7/28 7:43
 */
public class 字符串中找出连续最长的数字串 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if (max < count) {
                        max = count;
                        end = i;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max + 1, end + 1));
        }
    }

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
