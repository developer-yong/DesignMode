package bridge;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class WinHandler implements ImageHandler {

    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Windows操作系统显示图像");
    }
}
