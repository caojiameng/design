package State;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 15:08
 */
public class Angry implements State {

    @Override
    public void doWork() {
        System.out.println("生气地做工作");
    }
}
