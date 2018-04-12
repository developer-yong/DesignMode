package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令队列
 *
 * @author coderyong
 */
public class CommandQueue {
    /**
     * 定义一个ArrayList来存储命令队列
     */
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    /**
     * 循环调用每一个命令对象的execute()方法
     */
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }
}