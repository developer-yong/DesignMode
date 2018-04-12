package factory.method;

/**
 * @author coderyong
 * @date 2018/3/15
 */
public class DBLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DBLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
