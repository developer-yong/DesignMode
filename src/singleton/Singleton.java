package singleton;

/**
 * @author coderyong
 * @date 2018/3/16
 * Initialization Demand Holder (IoDH)式单例
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式
 * （其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）。
 */
public class Singleton {
    private Singleton() {
    }

    private static class HolderClass {
        private final static Singleton sInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.sInstance;
    }
}
