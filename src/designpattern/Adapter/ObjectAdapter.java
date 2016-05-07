package designpattern.Adapter;

/**
 * Created by bliu13 on 7/11/2015.
 */
public class ObjectAdapter implements Target {


    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void calculateX() {
        System.out.println("Adapter method, call source");
        source.calculateX();
    }

    @Override
    public void calculateY() {
        System.out.println("Adapter method only.");
    }
}