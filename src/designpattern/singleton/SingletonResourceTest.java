package designpattern.singleton;

/**
 * Created by bliu13 on 6/30/2015.
 */
public class SingletonResourceTest {
    public static void main(String[] args){
        SingletonResourse sr = SingletonResourse.getInstance();
        SingletonResourse sr2 = SingletonResourse.getInstance();
    }
}
