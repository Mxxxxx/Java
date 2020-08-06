package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/5 22:21
 */
public class 线程例子 {
    public static class MyThreag extends Thread {
        @Override
        public void run() {
            System.out.println("线程");
        }
    }

    public static void main(String[] args) {
        MyThreag t = new MyThreag();
        t.start();
        
    }
}
