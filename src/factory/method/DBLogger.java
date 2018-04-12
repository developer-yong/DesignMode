package factory.method;

/**
 * @author coderyong
 * @date 2018/3/15
 */
public class DBLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
