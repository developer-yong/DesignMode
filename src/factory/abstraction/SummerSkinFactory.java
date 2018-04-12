package factory.abstraction;

/**
 * @author coderyong
 * @date 2018/3/16
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

}
