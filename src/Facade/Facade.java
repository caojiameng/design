package Facade;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:59
 */
public class Facade {
        Step1 step1=new Step1();
        Step2 step2=new Step2();
        Step3 step3=new Step3();

       public boolean prove(){
            if (step1.isValid()&&step2.isValid()&&step3.isValid()){
                System.out.println("合格");
                return true;
            }
            System.out.println("不合格");
            return false;
        }
}
