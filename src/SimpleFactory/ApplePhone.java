package SimpleFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 9:55
 */
public class ApplePhone extends Product{

    @Override
    public void produce() {
        System.out.println("开始生产苹果手机");
    }
}
