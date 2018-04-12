package factory.simple;

/**
 * @author coderyong
 * @date 2018/3/13
 */
class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}