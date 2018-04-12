package builder;

/**
 * @author coderyong
 * @date 2018/3/20
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public ActorBuilder type() {
        actor.setType("天使");
        return this;
    }

    @Override
    public ActorBuilder sex() {
        actor.setSex("女");
        return this;
    }

    @Override
    public ActorBuilder face() {
        actor.setFace("漂亮");
        return this;
    }

    @Override
    public ActorBuilder costume() {
        actor.setCostume("白裙");
        return this;
    }

    @Override
    public ActorBuilder hairstyle() {
        actor.setHairstyle("披肩长发");
        return this;
    }
}
