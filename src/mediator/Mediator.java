package mediator;

/**
 * 抽象中介者
 *
 * @author coderyong
 */
public interface Mediator {

    /**
     * 封装同事对象之间的交互
     *
     * @param c 组件
     */
    void componentChanged(Component c);
}  