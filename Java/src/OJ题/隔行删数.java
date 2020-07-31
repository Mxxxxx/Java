package OJ题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/31 9:40
 */
public class 隔行删数 {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        List<Integer> list = new ArrayList<>();
        if (num > 1000) {
            num = 999;
        }
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() > 1) {
            i = (i + 2) % list.size();
            list.remove(i);
        }
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
