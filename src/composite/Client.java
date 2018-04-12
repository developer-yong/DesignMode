package composite;

class Client {
    public static void main(String[] args) {
        //针对抽象构件编程
        Folder folder = new Folder("组合模式资料");
        AbstractFile image = new ImageFile("组合模式图片");
        AbstractFile text = new TextFile("组合模式文档");

        folder.add(image);
        folder.add(text);

        folder.killVirus();
    }
}