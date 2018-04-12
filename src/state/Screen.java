package state;

/**
 * 屏幕类
 *
 * @author coderyong
 */
public class Screen {
    //枚举所有的状态，currentState表示当前状态  
    private StateGlass currentState, normalState, largerState, largestState;

    public Screen() {
        //创建正常状态对象
        this.normalState = new DefaultState();
        //创建二倍放大状态对象
        this.largerState = new LargerState();
        //创建四倍放大状态对象
        this.largestState = new LargestState();
        //设置初始状态
        this.currentState = normalState;
        this.currentState.display();
    }

    public void setState(StateGlass state) {
        this.currentState = state;
    }

    /**
     * 单击事件处理方法，封转了对状态类中业务方法的调用和状态的转换
     */
    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (this.currentState == largerState) {
            this.setState(largestState);
            this.currentState.display();
        } else if (this.currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }
}  
