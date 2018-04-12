package decorator;

class Client {
    public static void main(String[] args) {
        //使用抽象构件定义
        Component component, componentSB, componentBB;
        //定义具体构件
        component = new Window();
        //定义装饰后的构件
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}