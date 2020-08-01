package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/1 7:35
 */
public class 快速排序 {
    public static int partition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && array[high] >= tmp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            array[low] = array[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && array[low] <= tmp) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            array[high] = array[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        array[low] = tmp;
        return low; // 返回tmp的正确位置

    }

    public static void quick(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int par = partition(array, left, right);
        quick(array, left, par - 1);
        quick(array, par + 1, right);
    }

    public static void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }
}
