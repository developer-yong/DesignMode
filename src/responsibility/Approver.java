package responsibility;

/**
 * 审批者类：抽象处理者
 *
 * @author coderyong
 * @date 2018/4/10
 */
public abstract class Approver {

    /**
     * 定义后继对象
     */
    protected Approver successor;
    /**
     * 审批者姓名
     */
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置后继者
     *
     * @param successor 后续处理者
     */
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    /**
     * 抽象请求处理方法
     *
     * @param request 采购请求
     */
    public abstract void processRequest(PurchaseRequest request);

}
