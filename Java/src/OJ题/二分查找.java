package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/26 7:22
 * 请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 */
public class 二分查找 {
    public int upper_bound_(int n, int v, int[] a) {
        if (v > a[n - 1]) {
            return n + 1;
        }
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) >>> 1;
            if (a[mid] >= v) {
                right = mid;//如果大，继续判断mid前是否还有比v大的
            } else {
                left = mid + 1;//小于v则说明，mid位置是第一个大于v的，跳出，通过 （left = mid + 1 ） >（ right =mid）
            }
        }
        return right + 1;
    }
}
