package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/7/29 20:35
 */
//时间复杂度 O(n^2)
//空间复杂度O(1)
//不稳定
public class 希尔排序 {
    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i < drr.length; i++) {
            shell(array, drr[i]);//分组进行插入排序
        }
    }

    //即插入排序的思想
    private static void shell(int[] array, int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i - gap; j >= 0; j -= gap) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }


    public static void shellaSort(int[] array) {
        int[] part = {5, 3, 1};
        for (int i = 0; i < part.length; i++) {
            shella(array, part[i]);
        }
    }

    private static void shella(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[gap];
            int j = i - gap;
            for (; j >= 0; j -= gap) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }
}
