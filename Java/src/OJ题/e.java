package OJ题;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/9/23 19:36
 */
public class e {
    public static void C(int n, int m, int a[], int b[]) {
        for (int i = m; i <= n; i++) {
            b[m - 1] = i - 1;
            if (m > 1) {
                C(i - 1, m - 1, a, b);
            } else {
                for (int j = 0; j < b.length; j++) {
                    System.out.printf("%d ", a[b[j]]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4
        int m = sc.nextInt(); // 2
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1; // a[0, 1, 2, 3] = { 1, 2, 3, 4};
        }
        int b[] = new int[m]; // 数组b中存储的是组合的元素在a中的下标
        C(n, m, a, b);
        sc.close();
    }
}
