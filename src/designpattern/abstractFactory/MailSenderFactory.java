package designpattern.abstractFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
