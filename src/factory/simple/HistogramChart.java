package factory.simple;

/**
 * @author coderyong
 * @date 2018/3/13
 */
class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}