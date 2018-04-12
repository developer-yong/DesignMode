package bridge;

class Client {
    public static void main(String[] args) {
        Image image = new PNGImage();
        ImageHandler handler = new WinHandler();
        image.setHandler(handler);
        image.parseFile("桥接模式图");
    }
}