package factory.abstraction;

/**
 * @author coderyong
 * @date 2018/3/16
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

}
