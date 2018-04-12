package bridge;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class PNGImage extends Image {
    /**
     * 创建一个像素矩阵对象
     *
     * @return Matrix对象
     */
    @Override
    public Matrix createMatrix() {
        return new Matrix();
    }

    @Override
    public void parseFile(String fileName) {
        System.out.println(fileName + "，格式为PNG。");
        handler.doPaint(createMatrix());
    }
}
