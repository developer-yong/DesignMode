package strategy;

/**
 * VIP会员票折扣类：具体策略类
 *
 * @author coderyong
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}