package singleton;

/**
 * @author coderyong
 * @date 2018/3/16
 * <p>
 *      饿汉式单例:
 *      饿汉式单例类在类被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，
 *      可以确保实例的唯一性；从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，
 *      因此要优于懒汉式单例。但是无论系统在运行时是否需要使用该单例对象，
 *      由于在类加载时该对象就需要创建，因此从资源利用效率角度来讲，
 *      饿汉式单例不及懒汉式单例，而且在系统加载时由于需要创建饿汉式单例对象，加载时间可能会比较长。
 * </p>
 */
public class EagerSingleton {
    private static final EagerSingleton sInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return sInstance;
    }
}
