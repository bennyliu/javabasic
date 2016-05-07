package designpattern.Adapter;

/**
 * Created by bliu13 on 7/11/2015.
 */
public class ClassAdapterTest {
    public static void  main(String[] args){
        Target target = new ClassAdapter();
        target.calculateX();
        target.calculateY();

    }

}
