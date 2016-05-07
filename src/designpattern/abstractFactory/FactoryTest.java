package designpattern.abstractFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class FactoryTest {
    public static void main(String[] args){
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
