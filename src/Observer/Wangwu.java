package Observer;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:39
 */
public class Wangwu implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("通知王五来拿钱");
    }
}
