package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderyong
 * @date 2018/4/9
 */
public class Folder implements AbstractFile{

    /**
     * 定义集合fileList，用于存储AbstractFile类型的成员
     */
    private List<AbstractFile> fileList=new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("****对文件夹'" + name + "'进行杀毒");

        //递归调用成员构件的killVirus()方法
        for(AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
