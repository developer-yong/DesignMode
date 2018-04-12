package state;

/**
 * 默认大小
 */
class DefaultState implements StateGlass {
    @Override
    public void display() {
        System.out.println("默认大小！");
    }
}