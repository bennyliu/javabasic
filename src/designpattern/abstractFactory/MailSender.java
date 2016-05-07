package designpattern.abstractFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail Sender");
    }
}
