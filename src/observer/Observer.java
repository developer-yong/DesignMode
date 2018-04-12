package observer;

/**
 * @author coderyong
 * @date 2018/3/21
 */
public interface Observer {
    String getName();

    void setName(String name);

    /**
     * 声明支援盟友方法
     */
    void help();

    /**
     * 声明遭受攻击方法
     *
     * @param acc
     */
    void beAttacked(AllyControlCenter acc);
}
