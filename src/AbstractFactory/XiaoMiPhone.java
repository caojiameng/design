package AbstractFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:44
 */
public class XiaoMiPhone implements Phone {

    @Override
    public void produce() {
        System.out.println("开始生产小米手机");
    }
}
