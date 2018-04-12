package builder;

/**
 * @author coderyong
 * @date 2018/3/20
 */
public abstract class ActorBuilder {

    protected Actor actor;

    public ActorBuilder() {
        actor = new Actor();
    }

    public abstract ActorBuilder type();

    public abstract ActorBuilder sex();

    public abstract ActorBuilder face();

    public abstract ActorBuilder costume();

    public abstract ActorBuilder hairstyle();

    /**
     * 工厂方法，返回一个完整的游戏角色对象
     *
     * @return 角色对象
     */
    public Actor create() {
        return actor;
    }
}
