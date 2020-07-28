package State;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 15:19
 */
public class Context {
    private State state;

    public void changeState(State state){
        this.state=state;
    }
    public void doSomething(){
        state.doWork();
    }
}
