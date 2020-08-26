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

class Hungera {
    private static Hungera hungera = new Hungera();

    public static Hungera getHungera() {
        return hungera;
    }
}

class Lazya {
    private static Lazya lazya;

    public static Lazya getLazya() {
        if (lazya == null) {
            lazya = new Lazya();
        }
        return lazya;
    }
}

class Lazyb {
    private static Lazyb lazyb;

    public static Lazyb getLazyb() {
        if (lazyb == null) {
            synchronized (Lazyb.class) {
                if (lazyb == null) {
                    lazyb = new Lazyb();
                }
            }
        }
        return lazyb;
    }
}
//=============================

class Hungry {
    private static Hungry hungry = new Hungry();

    public static Hungry getHungry() {
        return hungry;
    }
}

//饿汉模式
class SingletonHungry {
    //在类初始化前就创建了对象，一定是线程安全的
    private static SingletonHungry singletonHungry = new SingletonHungry();

    public static SingletonHungry getSingletonHungry() {
        return singletonHungry;
    }
}

//class SingletonHungry {
//    //类加载时，就实例化，并且创建单例对象
//    private static SingletonHungry singletonHungry = new SingletonHungry();
//
//    public static SingletonHungry getInstance() {
//        return singletonHungry;
//    }
//}
class A {
    private static A a = new A();

    private A() {
    }

    public static A getInstance() {
        return a;
    }
}

//懒汉模式

class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    public static synchronized Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}


class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}

class B {
    private static B b;

    private B() {
    }

    public static synchronized B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}

//class SingletonLazy {
//    private static SingletonLazy singletonLazy;
//
//    private SingletonLazy() {
//    }
//
//    public static synchronized SingletonLazy getInstance() {
//        // 只有在第一次调用该方法的时候才会初始化
//        // 并且加了 synchronized 关键字（线程安全），但是每次调用
//        // 都会线程同步,这样会消耗很多不必要的资源，不建议使用
//        if (singletonLazy == null) {
//            singletonLazy = new SingletonLazy();
//        }
//        return singletonLazy;
//    }
//}
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

class SingleDouble {
    private static SingleDouble singleDouble;

    private SingleDouble() {
    }

    public static SingleDouble singleDouble() {
        if (singleDouble == null) {
            synchronized (SingleDouble.class) {
                if (singleDouble == null) {
                    singleDouble = new SingleDouble();
                }
            }
        }
        return singleDouble;
    }
}

class C {
    private static C c;

    private C() {
    }

    public static C getInstance() {
        if (c == null) {
            synchronized (C.class) {
                if (c == null) {
                    c = new C();
                }
            }
        }
        return c;
    }
}
