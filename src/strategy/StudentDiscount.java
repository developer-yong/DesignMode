package strategy;

/**
 * 学生票折扣类：具体策略类
 *
 * @author coderyong
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}   