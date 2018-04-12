package decorator;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class ComponentDecorator implements Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
