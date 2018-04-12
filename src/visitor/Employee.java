package visitor;

/**
 * 员工类：抽象元素类
 */
interface Employee {
    /**
     * 接受一个抽象访问者访问
     *
     * @param handler
     */
    void accept(Department handler);
}  