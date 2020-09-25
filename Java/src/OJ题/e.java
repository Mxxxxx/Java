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

    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i <= s1.length(); i++)
            for (int j = 1; j <= s2.length(); j++)
                dp[i][j] = s1.charAt(i-1) == s2.charAt(j-1) ? dp[i-1][j-1]+1 : Math.max(dp[i-1][j], dp[i][j-1]);
        return dp[s1.length()][s2.length()];
    }
    public int longestCommonSubsequence1(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {

            for (int j = 1; j <= text2.length(); j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[text1.length()][text2.length()];
    }
}
