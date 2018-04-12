package decorator;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setScrollBar();
    }

    private void setScrollBar() {
        System.out.println("为构件增加黑色边框！");
    }

}
