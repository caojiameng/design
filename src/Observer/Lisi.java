package Observer;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:38
 */
public class Lisi implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("通知李四来拿钱");
    }
}
