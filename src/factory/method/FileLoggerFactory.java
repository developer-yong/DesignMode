package factory.method;

/**
 * @author coderyong
 * @date 2018/3/15
 */
public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
