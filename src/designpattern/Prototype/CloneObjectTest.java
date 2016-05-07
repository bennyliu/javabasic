package designpattern.Prototype;

/**
 * Created by bliu13 on 7/3/2015.
 */
public class CloneObjectTest {

    public static void main(String[] args){
        CloneObject a = new CloneObject("Jan",23);
        CloneObject b = new CloneObject();

        b = (CloneObject)a.clone();

        b.setAge(29);
        b.setName("Helen");

        System.out.println(a.toString());
        System.out.println(b.toString());
    }

}
