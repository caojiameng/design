package AbstractFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:49
 */
public class HuaNanFactory implements Factory {

    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }
}
