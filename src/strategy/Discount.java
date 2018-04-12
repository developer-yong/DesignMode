package strategy;

/**
 * 折扣类：抽象策略类
 *
 * @author coderyong
 */
public interface Discount {
    /**
     * 计算折扣价格
     *
     * @param price 实际价格
     * @return
     */
    double calculate(double price);
}  