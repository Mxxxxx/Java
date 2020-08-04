package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/4 8:20
 */
public class 单例模式 {
    private static final 单例模式 a = new 单例模式();

    private 单例模式() {
    }

    public 单例模式 getA() {
        return a;
    }
}

//懒汉模式
class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        // 只有在第一次调用该方法的时候才会初始化
        // 并且加了 synchronized 关键字（线程安全），但是每次调用
        // 都会线程同步,这样会消耗很多不必要的资源，不建议使用
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

// 双重检查锁定单例(Double Check Lock)
class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1() {
    }
    public void doSomething() {
        System.out.println("do something");
    }
    public static Singleton1 getInstance() {
        if (singleton == null) {
            synchronized (Singleton1.class) {
                if (singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }
}
