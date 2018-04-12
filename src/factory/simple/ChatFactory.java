package factory.simple;

/**
 * @author coderyong
 * @date 2018/3/13
 */
class ChatFactory {

    static final String TYPE_HISTOGRAM = "histogram";
    static final String TYPE_LINE = "line";
    static final String TYPE_PIE = "pie";

    /**
     * 静态工厂方法
     *
     * @param type 图表类型
     * @return 图表对象
     */
    public static Chart getChart(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case TYPE_HISTOGRAM:
                return new HistogramChart();
            case TYPE_LINE:
                return new LineChart();
            case TYPE_PIE:
                return new PieChart();
            default:
                throw new IllegalStateException("暂不支持图表类型: " + type);
        }
    }
}