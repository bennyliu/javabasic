package designpattern.Factory.NormalFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class FactoryTest {
    public static void main(String[] args){
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.send();

        Sender sender2 = factory.produce("mail");
        sender2.send();

//        Sender sender3 = factory.produce("mail3");
//        sender3.send();
    }
}
