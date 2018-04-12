package memento;

class Client {
    /**
     * 定义一个索引来记录当前状态所在位置
     */
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String args[]) {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    /**
     * 下棋
     *
     * @param chess
     */
    public static void play(Chessman chess) {
        //保存备忘录
        mc.setMemento(chess.save());
        index++;
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    /**
     * 悔棋
     *
     * @param chess
     * @param i
     */
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        //撤销到上一个备忘录
        chess.restore(mc.getMemento(i - 1));
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    /**
     * 撤销悔棋
     *
     * @param chess
     * @param i
     */
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        //恢复到下一个备忘录
        chess.restore(mc.getMemento(i + 1));
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}