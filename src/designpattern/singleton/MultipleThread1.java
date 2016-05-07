package designpattern.singleton;

/**
 * Created by bliu13 on 6/30/2015.
 */
public class MultipleThread1 extends Thread {
    public void run(){
        System.out.println("In Thread " +  + Thread.currentThread().getId());
        SingletonResourse sr = SingletonResourse.getInstance();
    }
}
