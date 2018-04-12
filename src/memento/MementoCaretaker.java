package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 象棋棋子备忘录管理类：负责人
 *
 * @author coderyong
 */
public class MementoCaretaker {
    /**
     * 定义一个集合来存储多个备忘录
     */
    private List<ChessmanMemento> mementos = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementos.add(memento);
    }
}  