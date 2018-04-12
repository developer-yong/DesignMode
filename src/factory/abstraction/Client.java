package factory.abstraction;

class Client {
    public static void main(String[] args) {
        //具体工厂类可以在config.xml中配置使用XMLUtil.getBean()获取
        SkinFactory factory = new SummerSkinFactory();
        factory.createButton().display();
        factory.createTextField().display();
    }
}