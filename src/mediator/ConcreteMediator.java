package mediator;

/**
 * 具体中介者
 *
 * @author coderyong
 */
public class ConcreteMediator implements Mediator {
    /**
     * 维持对各个同事对象的引用
     */
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;
    public Label label;

    /**
     * 封装同事对象之间的交互
     *
     * @param c 组件
     */
    @Override
    public void componentChanged(Component c) {
        //单击按钮  
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update(); //文本标签更新
        }
        //从列表框选择客户  
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户  
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}  