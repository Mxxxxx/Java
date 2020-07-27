package OJ题;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/27 15:18
 */
public class 汽水瓶 {
    public static int func(int num) {
        int sum = 0;
        while (num > 2) {
            sum += num / 3;//直接喝的
            num = num / 3 + num % 3;//剩余
            if (num == 2) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            System.out.println(func(num));
        }
    }
}
