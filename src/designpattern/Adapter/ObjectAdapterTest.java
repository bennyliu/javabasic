package designpattern.Adapter;

/**
 * Created by bliu13 on 7/11/2015.
 */
public class ObjectAdapterTest {
    public static void main(String[] args){
        Source src = new Source();
        Target target = new ObjectAdapter(src);
        target.calculateX();
        target.calculateY();
    }
}
