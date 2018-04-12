package visitor;

/**
 * 部门类：抽象访问者类
 *
 * @author coderyong
 */
public abstract class Department {
    /**
     * 声明一组重载的访问方法，用于访问不同类型的具体元素
     *
     * @param employee
     */
    public abstract void visit(FullTimeEmployee employee);

    public abstract void visit(PartTimeEmployee employee);
}  