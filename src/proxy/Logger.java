package proxy;

/**
 * @author coderyong
 * @date 2018/4/10
 */
public class Logger {
    /**
     * 模拟实现日志记录
     *
     * @param userId 用户ID
     */
    public void log(String userId) {
        System.out.println("更新数据库，用户 " + userId + " 查询次数加1！");
    }
}
