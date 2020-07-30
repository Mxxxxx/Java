package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/7/30 15:43
 */
public class 选择排序 {
    public static void func(int[] array) {
        for (int i = 0; i < array.length; i++) {//选择第i位元素，后面一次与该元素比较大小
            //较大的放在方面
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
