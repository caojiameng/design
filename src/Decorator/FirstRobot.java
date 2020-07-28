package Decorator;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 10:58
 */
public class FirstRobot implements Robot {

    @Override
    public void doSomething() {
        System.out.println("开始唱歌跳舞");
    }
}
