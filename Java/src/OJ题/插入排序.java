package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/7/28 21:33
 */
//时间复杂度 O(n^2)
//空间复杂度O(1)
//稳定
public class 插入排序 {
    public static void func1(int[] array) {
        int tmp = array[1];
        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    public static void func(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {//i的前一个比i大的话，将大的值赋值给i
                    array[j + 1] = array[j];
                } else {
                    break;//如果i的前一个比i小，前面的就不需要再比较，直接跳出
                    //跳出时，j的下标是j的前一个
                }
            }
            array[j + 1] = tmp;//最后将tmp的值给
        }
    }


    public static void insertSort(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
}
