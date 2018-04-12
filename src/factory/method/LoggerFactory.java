package factory.method;

/**
 * @author coderyong
 * @date 2018/3/15
 */
public abstract class LoggerFactory {
    /**
     * 输出日志
     */
    public void writeLog(){
        createLogger().writeLog();
    }

    /**
     * 创建Logger操作对象
     *
     * @return Logger
     */
    abstract Logger createLogger();
}
