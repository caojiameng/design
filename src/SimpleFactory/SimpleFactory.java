package SimpleFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 9:36
 */
public class SimpleFactory {

    public Product product(Integer tag) {
        if (tag == 1) {
            return new ApplePhone();
        } else if (tag == 2) {
            return new HuaWeiPhone();
        }
        return null;
    }

}
