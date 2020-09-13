package OJ题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/9/10 16:20
 */
public class ti {
    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String num = in.next();
//            int n = in.nextInt();
//            judgeFunc(num);
//            func(num, n);
//        }
//    }
//    public static void main(String[] args) {
//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program" + "ming";
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s1.intern());
//    }

    private static void func(String num, int n) {
        String newNum = "";
        for (int i = 0; i < num.length(); i++) {
            if (i != n - 1) {
                newNum += num.charAt(i);
            }
        }

        char[] chars = newNum.toCharArray();
        char tmp = chars[0];
        for (int i = 0; i < chars.length; i++) {
            tmp = chars[i];
            int j = i - 1;
            for (; j > 0; j--) {
                if (chars[j] - '0' < tmp - '0') {
                    chars[j + 1] = chars[j];
                } else {
                    break;
                }
            }
            chars[j + 1] = tmp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    private static void judgeFunc(String num) {
        if (num.length() > 8) {
            System.out.println("erro");
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) > '9' || num.charAt(i) < '0') {
                System.out.println("erro");
                return;
            }
        }
    }

    public static void func2(double n) {
        
    }
}
