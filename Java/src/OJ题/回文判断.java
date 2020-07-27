package OJ题;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/26 22:34
 */
public class 回文判断 {

    public static int fun(String A, String B) {
        int count = 0;
        for (int i = 0; i <= A.length(); i++) {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            s1.append(A).insert(i, B);
            s2.append(A).insert(i, B).reverse();
            String s = s1.toString();
            String s3 = s2.toString();
            if (s.equals(s3)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        System.out.println(fun(A, B));
    }
}
