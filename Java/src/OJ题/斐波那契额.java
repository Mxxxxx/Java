package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/9/6 9:19
 */
public class 斐波那契额 {
    public int func(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return func(n - 1) + func(n - 2);
    }

    public int Fibonacci(int n) {
        if (n > 39) {
            return -1;
        }
        return func(n);
    }
}
