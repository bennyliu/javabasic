package designpattern.singleton;

/**
 * Created by bliu13 on 6/30/2015.
 */
public class MultipleThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("In Thread Runnable: " + Thread.currentThread().getId());
        SingletonResourse sr = SingletonResourse.getInstance();
    }
}
