package responsibility;

/**
 * 董事会类：具体处理者
 *
 * @author coderyong
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    /**
     * 具体请求处理方法
     *
     * @param request 采购请求
     */
    @Override
    public void processRequest(PurchaseRequest request) {
        //处理请求
        System.out.println("召开董事会审批采购单：" + request.getNumber()
                + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
    }
}