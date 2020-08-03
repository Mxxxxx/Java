package OJ题;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/8/3 10:15
 */
public class 餐馆金额最大 {
    static class Customer implements Comparable<Customer> {
        public int num;//某批人数
        public int fee;//预计消费金额

        public Customer(int num, int fee) {
            this.num = num;
            this.fee = fee;
        }

        @Override
        public int compareTo(Customer o) {
            if (o.fee > this.fee) {
                return 1;
            } else if (o.fee < this.fee) {
                return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//桌子数
            int m = sc.nextInt();//客人批数
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();//每个桌子可以容纳的人数
            }
            Arrays.sort(a);//将其从小到大排序
            PriorityQueue<Customer> queue = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                int b = sc.nextInt();//每一批客人数量
                int c = sc.nextInt();//消费金额
                if (b <= a[n - 1]) {//小于最大桌子容量就可以吃饭
                    queue.add(new Customer(b, c));//满足的全部放入队列
                }
            }
            long sum = 0;//总金额
            int count = 0;//桌子使用数量
            boolean[] flg = new boolean[n];//看桌子是否被占
            while (!queue.isEmpty()) {
                Customer customer = queue.poll();//出一个吃饭的人
                for (int i = 0; i < n; i++) {
                    if (a[i] >= customer.num && !flg[i]) {//某个桌子数可以被使用，并且没有被占
                        sum += customer.fee;
                        count++;
                        flg[i] = true;//将使用的桌子标记被占
                        break;
                    }
                }
                if (count == n) {//如果使用量已经满，则直接退出，顾客批数不一定为桌子数量，可能比桌子数量多
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
