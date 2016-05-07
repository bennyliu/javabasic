package designpattern.Factory.MultipleFactoryMethodsFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class MultipleFactoryMethodFactory {
    public Sender produceMailSender() {


        return new MailSender();
    }
    public Sender produceSmsSender() {

        return new SmsSender();


    }
}
