package Adapter;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:20
 */
public class Adapter implements Translaor {
    private Speaker speaker;

    public Adapter(Speaker speaker){
        this.speaker=speaker;
    }

    @Override
    public void translate() {
        String result=speaker.speak();
        result="Hi"+result;
        System.out.println(result);
    }
}
