package designpattern.Factory.StaticFactoryMethodsFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class FactoryTest {
    public static void main(String[] args){
        Sender sender = StaticFactoryMethodFactory.produceMailSender();
        sender.send();

        Sender sender2 = StaticFactoryMethodFactory.produceSmsSender();
        sender2.send();

    }
}
