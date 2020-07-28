import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/29 7:25
 */
public class 删除公共字符串 {
    public static void func(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if (!B.contains(A.charAt(i) + "")) {
                System.out.print(A.charAt(i));
            }
        }
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        func(A, B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String pattern = "[" + s2 + "]";//正则表达式
            String result = s1.replaceAll(pattern, "");
            System.out.println(result);
        }
    }
}
