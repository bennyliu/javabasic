package designpattern.Factory.MultipleFactoryMethodsFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class FactoryTest {
    public static void main(String[] args){
        MultipleFactoryMethodFactory factory = new MultipleFactoryMethodFactory();
        Sender sender = factory.produceMailSender();
        sender.send();

        Sender sender2 = factory.produceSmsSender();
        sender2.send();

    }
}
