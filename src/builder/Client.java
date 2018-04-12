package builder;

class Client {
    public static void main(String[] args) {
        //通过指挥者创建完整的建造者对象
        Actor actor = new AngelBuilder()
                .type()
                .sex()
                .face()
                .costume()
                .hairstyle()
                .create();

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());

    }
}