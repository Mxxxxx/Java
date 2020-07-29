package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/7/28 21:33
 */
public class 插入排序 {
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
}
