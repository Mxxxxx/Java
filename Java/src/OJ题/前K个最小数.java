package OJ题;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Meng Xin
 * @Date 2020/8/3 9:48
 */
public class 前K个最小数 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            arrayList.add(input[i]);
        }
        arrayList.sort((o1, o2) -> o1 - o2);
        List<Integer> list = arrayList.subList(0, k);
        for (int i = 0; i < list.size(); i++) {
            arrayList1.add(list.get(i));
        }
        return arrayList1;
    }

}
