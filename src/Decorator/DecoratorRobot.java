package Decorator;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 11:01
 */

public class DecoratorRobot implements Robot{
    private Robot robot;

    public DecoratorRobot(Robot robot){
        this.robot=robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
    }

    public void  doMore(){
          robot.doSomething();
          System.out.println("升级");
    }


}
