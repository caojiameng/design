package Factory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:27
 */
public class FactoryB implements Factory {

    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }
}
