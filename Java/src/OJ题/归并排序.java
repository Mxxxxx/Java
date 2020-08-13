package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/5 7:46
 */
//时间：O(nlogn)
//空间:O(n)
//稳定
public class 归并排序 {
    public static void mergeSort2(int[] array) {
        mereSorInit2(array, 0, array.length - 1);
    }

    private static void mereSorInit2(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) >>> 1;
        mereSorInit2(array, low, mid);
        mereSorInit2(array, mid + 1, high);

        merge2(array, low, mid, high);
    }

    private static void merge2(int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int[] ret = new int[high - low + 1];
        int i = 0;
        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            } else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }
        while (s2 <= high) {
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j + low] = ret[j];
        }
    }


    public static void mergeSort1(int[] array) {
        mereSorInit1(array, 0, array.length - 1);
    }

    private static void mereSorInit1(int[] array, int low, int hight) {
        if (low >= hight) {
            return;
        }
        int mid = (low + hight) >>> 1;
        mereSorInit1(array, low, mid);
        mereSorInit1(array, mid + 1, hight);
        merge1(array, low, mid, hight);
    }

    private static void merge1(int[] array, int low, int mid, int hight) {
        int s1 = low;
        int s2 = mid + 1;
        int len = hight - low + 1;
        int[] ret = new int[len];
        int i = 0;
        while (s1 <= mid && s2 <= hight) {
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            } else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }
        while (s2 <= hight) {
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j + low] = ret[j];
        }
    }

//    public static void mergeSort1(int[] array) {
//        mereSorInt1(array, 0, array.length - 1);
//    }
//
//    private static void mereSorInt1(int[] array, int low, int high) {
//        if (low >= high) {
//            return;
//        }
//        int mid = (high + low) >>> 1;
//        mereSorInt1(array, low, mid);
//        mereSorInt1(array, mid + 1, high);
//        merge1(array, low, mid, high);
//    }
//
//    private static void merge1(int[] array, int low, int mid, int high) {
//        int s1 = low;
//        int s2 = mid + 1;
//        int length = high - low + 1;
//        int[] ret = new int[length];
//        int i = 0;
//        while (s1 <= mid && s2 <= high) {
//            if (array[s1] <= array[s2]) {
//                ret[i++] = array[s1++];
//            } else {
//                ret[i++] = array[s2++];
//            }
//        }
//
//        while (s1 <= mid) {
//            ret[i++] = array[s1++];
//        }
//        while (s2 <= high) {
//            ret[i++] = array[s2++];
//        }
//        for (int j = 0; j < ret.length; j++) {
//            array[j + low] = ret[j];
//        }
//    }

    public static void mereSorInt(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        //分解
        int mid = (low + high) >>> 1;
        mereSorInt(array, low, mid);//分割成一个元素
        mereSorInt(array, mid + 1, high);

        //进行合并
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;//第一段开始
        int s2 = mid + 1;//第二段开始
        int len = high - low + 1;
        int[] ret = new int[len];
        int i = 0;//表使ret的下标
        while (s1 <= mid && s2 <= high) {//证明两段都有数据
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            } else {
                ret[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }
        while (s2 <= high) {
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j + low] = ret[j];
        }
    }

    public static void mergeSort(int[] array) {
        mereSorInt(array, 0, array.length - 1);
    }
}
