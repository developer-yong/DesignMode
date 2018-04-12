package factory.simple;

import utils.XMLUtil;

class Client {
    public static void main(String[] args) {
        Chart chart = ChatFactory.getChart(XMLUtil.getChartType());
        if (chart != null) {
            chart.display();
        } else {
            System.out.println("没有在config.xml中找到chartType相关配置");
        }
    }
}