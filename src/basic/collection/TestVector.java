package basic.collection;

import java.util.Vector;

/**
 * Created by bliu13 on 9/13/2015.
 */
public class TestVector {


    public static void main(String[] args) {

        Vector v = new Vector(4);
        v.add("Test0");
        v.add("Test1");
        v.add("Test0");
        v.add("Test2");
        v.add("Test2");

        System.out.println(v.size());
        v.remove("Test2");
        System.out.println(v.size());


    }


}
