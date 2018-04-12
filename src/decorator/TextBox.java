package decorator;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class TextBox implements Component {

    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
