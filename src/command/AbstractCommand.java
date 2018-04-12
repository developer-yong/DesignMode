package command;

/**
 * 抽象命令类
 *
 * @author coderyong
 */
public interface AbstractCommand {

    /**
     * 声明命令执行方法execute()
     *
     * @param value
     * @return
     */
    int execute(int value);

    /**
     * 声明撤销方法undo()
     *
     * @return
     */
    int undo();
}  
