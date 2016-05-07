package designpattern.singleton;

/**
 * Created by bliu13 on 6/30/2015.
 */
public class SingletonResourse {
    private static SingletonResourse instance = null;
    private SingletonResourse(){
        System.out.println("Construct SingletonResource.");
    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new SingletonResourse();
        }else {
            System.out.println("Reuse instance. -- In syncInit()");
        }
    }

    public static SingletonResourse getInstance(){
        if(instance == null) {
            syncInit();
        } else {
            System.out.println("Reuse instance. -- In getInstance()");
        }
        return instance;
    }
}
