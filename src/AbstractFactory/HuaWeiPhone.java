package AbstractFactory;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:48
 */
public class HuaWeiPhone implements Phone {

    @Override
    public void produce() {
        System.out.println("开始生产华为手机");
    }
}
