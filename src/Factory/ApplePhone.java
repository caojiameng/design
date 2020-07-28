package Factory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:06
 */
public class ApplePhone implements Phone{

    @Override
    public void produce() {
        System.out.println("开始生产苹果手机");
    }
}
