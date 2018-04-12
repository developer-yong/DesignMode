package composite;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
