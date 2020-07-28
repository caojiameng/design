/**
 * description
 *
 * @author txcaojiamen 2020/07/28 9:20
 */
public class Singleton {
    private Singleton(){}

    private static Singleton singleton=new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

}
