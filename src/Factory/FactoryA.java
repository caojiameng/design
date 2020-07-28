package Factory;


/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:19
 */
public class FactoryA implements Factory {


    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
