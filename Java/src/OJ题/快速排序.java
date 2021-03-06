package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/1 7:35
 */
//不稳定
//时间：O(n^2)
//空间O(n)
public class 快速排序 {
//    public static void quickSort2(int[] array) {
//        quick2(array, 0, array.length - 1);
//    }
//
//    private static void quick2(int[] array, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int mid = mida(array, left, right);
//        quick2(array, left, mid - 1);
//        quick2(array, mid + 1, right);
//    }
//
//    private static int mida(int[] array, int low, int high) {
//        int tmp = array[low];
//        while (low < high) {
//            while (low < high && array[high] >= tmp) {
//                high--;
//            }
//            array[low] = array[high];
//            while (low <= high && array[low] <= tmp) {
//                low++;
//            }
//            array[high] = array[low];
//        }
//        array[low] = tmp;
//        return low;
//    }
//
//    public static void quickSort1(int[] array) {
//        quick1(array, 0, array.length - 1);
//    }
//
//    private static void quick1(int[] array, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int par = partio(array, left, right);
//        quick1(array, left, par - 1);
//        quick1(array, par + 1, right);
//    }
//
//    private static int partio(int[] array, int low, int high) {
//        int tmp = array[low];
//        while (low < high) {
//            while (low < high && array[high] >= tmp) {
//                high--;
//            }
//            array[low] = array[high];
//            while (low < high && array[low] <= tmp) {
//                low++;
//            }
//            array[high] = array[low];
//        }
//        array[low] = tmp;
//        return low;
//    }

    public static int partition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && array[high] >= tmp) {
                high--;//跳出时，是队尾元素小于tmp
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            array[low] = array[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && array[low] <= tmp) {
                low++;//跳出时，是队头元素大于tmp
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
        //优化
        if (right - left + 1 <= 100) {
            插入排序.func(array);
        }
        three_num_mid(array, left, right);
        int par = partition(array, left, right);
        quick(array, left, par - 1);
        quick(array, par + 1, right);
    }

    //优化
    private static void three_num_mid(int[] array, int left, int right) {
        //array[mid]<=array[left]<=array[right]
        int mid = (left + right) / 2;
        if (array[mid] > array[left]) {
            swap(array, mid, left);
        }
        if (array[mid] > array[right]) {
            swap(array, mid, right);
        }
        if (array[left] > array[right]) {
            swap(array, left, right);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    //====================================================
    public static void quickSort1(int[] array) {
        quick1(array, 0, array.length - 1);
    }

    private static void quick1(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int par = partion(array, left, right);
        quick1(array, left, par - 1);
        quick1(array, par + 1, right);

    }

    private static int partion(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    //    ==============================================
    public static void quickSort3(int[] array) {
        quick3(array, 0, array.length - 1);
    }

    private static void quick3(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int par = partion3(array, low, high);
        quick3(array, low, par - 1);
        quick3(array, par + 1, high);
    }

    private static int partion3(int[] array, int left, int right) {
        int tmp = array[0];
        while (left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }
            array[0] = array[right];
            while (left < right && array[left] <= tmp) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = tmp;
        return left;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 7, 8, 6, 4};
        quickSort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
