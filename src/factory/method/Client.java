package factory.method;

import utils.XMLUtil;

class Client {
    public static void main(String[] args) {
        LoggerFactory factory = (LoggerFactory) XMLUtil.getBean();
        if (factory != null) {

            Logger logger = factory.createLogger();
            logger.writeLog();

            //在工厂类中直接调用日志记录器类的业务方法writeLog()
            factory.writeLog();
        } else {
            System.out.println("请在config.xml配置className节点为LoggerFactory子类包名.类名");
        }
    }
}