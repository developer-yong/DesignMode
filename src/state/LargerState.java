package state;

/**
 * 二倍状态类
 */
class LargerState implements StateGlass {
    @Override
    public void display() {
        System.out.println("二倍大小！");
    }
}  