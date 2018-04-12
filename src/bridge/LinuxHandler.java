package bridge;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class LinuxHandler implements ImageHandler {

    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux操作系统显示图像");
    }
}
