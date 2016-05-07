package designpattern.Adapter;

/**
 * Created by bliu13 on 7/11/2015.
 */
public class InterfaceAdapterTest {

    public static void main(String[] args){
        Sourceable src1 = new Implementation1();
        Sourceable src2 = new Implementation2();
        src1.method1();
        src2.method2();
        src1.method2();
        src2.method1();
    }
}
