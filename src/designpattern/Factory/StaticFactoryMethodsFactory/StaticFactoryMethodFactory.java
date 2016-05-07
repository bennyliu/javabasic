package designpattern.Factory.StaticFactoryMethodsFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class StaticFactoryMethodFactory {
    public static Sender produceMailSender() {


        return new MailSender();
    }
    public static Sender produceSmsSender() {

        return new SmsSender();


    }
}
