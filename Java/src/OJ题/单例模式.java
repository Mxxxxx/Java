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

//饿汉单例
class HungrySingle {
    private static HungrySingle hungrySingle = new HungrySingle();

    public static HungrySingle getHungrySingle() {
        return hungrySingle;
    }
}

//==============
class hungrySingle {
    private static hungrySingle hungrySingle1 = new hungrySingle();

    public static hungrySingle getInstance() {
        return hungrySingle1;
    }
}

//懒汉单例
class LazySingle {
    private static LazySingle lazySingle;

    private LazySingle() {

    }

    public static LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}

//=======
class lazySingle {
    private static lazySingle lazySingle1;

    private lazySingle() {

    }

    public static lazySingle getInstance() {
        if (lazySingle1 == null) {
            lazySingle1 = new lazySingle();
        }
        return lazySingle1;
    }
}

//懒汉双重检测
class LazySingleDouble {
    private static LazySingleDouble lazySingleDouble;

    private LazySingleDouble() {

    }

    public static synchronized LazySingleDouble getLazySingleDouble() {
        if (lazySingleDouble == null) {
            lazySingleDouble = new LazySingleDouble();
        }
        return lazySingleDouble;
    }
}

//============
class lazySingleDouble {
    private static lazySingleDouble lazySingleDouble1;

    private lazySingleDouble() {

    }

    public static synchronized lazySingleDouble getInstance() {
        if (lazySingleDouble1 == null) {
            lazySingleDouble1 = new lazySingleDouble();
        }
        return lazySingleDouble1;
    }
}

