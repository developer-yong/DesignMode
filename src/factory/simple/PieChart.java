package factory.simple;

/**
 * @author coderyong
 * @date 2018/3/13
 */
class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}