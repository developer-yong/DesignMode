package factory.abstraction;

/**
 * @author coderyong
 * @date 2018/3/16
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框。");
    }
}
