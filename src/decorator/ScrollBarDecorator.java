package decorator;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setScrollBar();
    }

    private void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }

}
