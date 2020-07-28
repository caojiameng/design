import AbstractFactory.Fruit;
import AbstractFactory.HuaBeiFactory;
import AbstractFactory.HuaNanFactory;
import AbstractFactory.Phone;
import Adapter.*;
import Decorator.DecoratorRobot;
import Decorator.FirstRobot;
import Decorator.Robot;
import Facade.Facade;
import Observer.Lisi;
import Observer.Wangwu;
import Observer.Zhangsan;
import State.Context;
import State.Happy;


public class Main {

    public static void main(String[] args) {
//        Singleton singleton1=Singleton.getInstance();
//        Singleton singleton2=Singleton.getInstance();
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//        System.out.println(singleton1==singleton2);

//        SimpleFactory.SimpleFactory.Product product= new SimpleFactory.SimpleFactory.Factory().product(1);
//        product.produce();

//        Product product=new SimpleFactory().product(1);
//        product.produce();
//
//        Phone huawei = new FactoryB().createPhone();
//        huawei.produce();
//
//        Phone apple =new FactoryA().createPhone();
//        apple.produce();

//        Fruit apple=new HuaNanFactory().createFruit();
//        apple.produce();
//
//        Fruit banana=new HuaBeiFactory().createFruit();
//        banana.produce();
//
//        Phone xiaomi=new HuaNanFactory().createPhone();
//        xiaomi.produce();

//        FirstRobot firstRobot=new FirstRobot();
//        firstRobot.doSomething();
//        DecoratorRobot seconod=new DecoratorRobot(firstRobot);
//        seconod.doMore();

//        new Adapter(new Speaker()).translate();

//        Zhangsan zhangsan=new Zhangsan();
//        zhangsan.borrow(new Lisi());
//        zhangsan.borrow(new Wangwu());
//        zhangsan.notifyCredits();
//
//        Facade facade=new Facade();
//        facade.prove();

        Context context=new Context();
        context.changeState(new Happy());
        context.doSomething();
    }
}
