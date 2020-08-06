package OJ题;

import java.util.concurrent.*;

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

    //线程池
    public void threadPoolExecutor(
            int corePoolSize,//线程池的核心大小
            int maximumPoolSize,//最大线程池大小。
            long keepAliveTime,//空余线程存活时间
            TimeUnit unit,//销毁时间单位
            BlockingQueue<Runnable> workQueue,//存储等待执行线程的工作队列
            ThreadFactory threadFactory,//创建线程的工厂
            RejectedExecutionHandler handler//拒绝策略，当工作队列、线程池全已满时如何拒绝新任务，默认抛出异常。
    ) {
        return;
    }
}
