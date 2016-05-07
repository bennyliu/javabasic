package designpattern.Builder;

/**
 * Created by bliu13 on 7/1/2015.
 */
public class BuilderTest {
    public static void main(String[] args){
        Builder builder = new Builder();
        builder.produceMailSender(2);
    }
}
