package designpattern.Factory.NormalFactory;

/**
 * Created by bliu13 on 6/29/2015.
 */
public class SenderFactory {
    public Sender produce(String type){

        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }
        System.out.println("Incorrect sender type.");
        return null;

    }
}
