package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/7/30 15:59
 */
public class 冒泡排序 {
    //时间复杂度 O(n^2)
    //空间复杂度O(1)
    //稳定
    public static void func(int[] array) {
        for (int i = 0; i < array.length; i++) {//总共比较的次数
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，
                // 总结就是i增多少，j的循环位置减多少
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }
}
