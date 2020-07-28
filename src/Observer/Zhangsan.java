package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:36
 */
public class Zhangsan implements Debit {
    List<Credit> credits=new ArrayList<Credit>();

    @Override
    public void borrow(Credit credit) {
        credits.add(credit);
    }

    @Override
    public void notifyCredits() {
        credits.stream().forEach(c->c.takeMoney());
    }
}
