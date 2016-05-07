package designpattern.singleton;

/**
 * Created by bliu13 on 6/30/2015.
 */
public class MultipleThreadTest {
    public static void main(String[] args){
        System.out.println("Main thread: " + Thread.currentThread().getId());
        MultipleThread1 th1 = new MultipleThread1();
        MultipleThread1 th2 = new MultipleThread1();
        th1.start();
        th2.start();

        MultipleThread2 th3t = new MultipleThread2();
        MultipleThread2 th4t = new MultipleThread2();
        Thread th3 = new Thread(th3t);
        Thread th4 = new Thread(th4t);

        th3.start();
        th4.start();
        th3t.run();//this will not start multiple thread
    }
}
