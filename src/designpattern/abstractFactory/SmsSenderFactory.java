package designpattern.abstractFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
