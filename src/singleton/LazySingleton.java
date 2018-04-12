package singleton;

/**
 * @author coderyong
 * @date 2018/3/16
 * <p>
 *     懒汉式双重检查锁定单例:
 *     懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，但是必须处理好多个线程同时访问的问题，
 *     特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，
 *     这意味着出现多线程同时首次引用此类的机率变得较大，需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响。
 * </p>
 */
public class LazySingleton {
    private volatile static LazySingleton sInstance = null;

    private LazySingleton() {
    }

    public static LazySingleton getsInstance() {
        //第一重判断
        if (sInstance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (sInstance == null) {
                    sInstance = new LazySingleton();
                }
            }
        }
        return sInstance;
    }
}
