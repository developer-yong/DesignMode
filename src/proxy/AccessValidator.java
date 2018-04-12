package proxy;

/**
 * @author coderyong
 * @date 2018/4/10
 */
public class AccessValidator {
    /**
     * 模拟实现登录验证
     *
     * @param userId 用户Id
     * @return
     */
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.println("用户 " + userId + " 登录成功！");
            return true;
        } else {
            System.out.println("用户 " + userId + " 登录失败！");
            return false;
        }
    }
}
