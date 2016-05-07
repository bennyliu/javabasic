package designpattern.Adapter;

/**
 * Created by bliu13 on 7/11/2015.
 */
public class ClassAdapter extends Source implements Target{

    public void calculateY(){
        System.out.println("This is in adapter.");
    }

}
