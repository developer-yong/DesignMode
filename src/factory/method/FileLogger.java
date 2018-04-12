package factory.method;

/**
 * @author coderyong
 * @date 2018/3/15
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
