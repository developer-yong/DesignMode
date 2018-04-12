package bridge;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public abstract class Image {

    protected ImageHandler handler;

    public void setHandler(ImageHandler handler) {
        this.handler = handler;
    }

    public abstract Matrix createMatrix();
    public abstract void parseFile(String fileName);
}
