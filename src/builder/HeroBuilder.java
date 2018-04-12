package builder;

/**
 * @author coderyong
 * @date 2018/3/20
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public ActorBuilder type() {
        actor.setType("英雄");
        return this;
    }

    @Override
    public ActorBuilder sex() {
        actor.setSex("男");
        return this;
    }

    @Override
    public ActorBuilder face() {
        actor.setFace("英俊");
        return this;
    }

    @Override
    public ActorBuilder costume() {
        actor.setCostume("盔甲");
        return this;
    }

    @Override
    public ActorBuilder hairstyle() {
        actor.setHairstyle("飘逸");
        return this;
    }
}
