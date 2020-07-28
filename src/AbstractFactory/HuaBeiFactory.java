package AbstractFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:52
 */
public class HuaBeiFactory implements Factory {

    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }
}
