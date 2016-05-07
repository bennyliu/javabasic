package designpattern.Factory.StaticFactoryMethodsFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SMS Sender");
    }
}
