package designpattern.Prototype;

/**
 * Created by bliu13 on 7/5/2015.
 */
public class DeepCloneObjectTest {

    public static void main(String[] args){
        CloneObject a = new CloneObject("Jan",23);
        DeepCloneObject b = new DeepCloneObject("HR", 23, a);

        DeepCloneObject c = (DeepCloneObject) b.clone();

        b.setSalary_grade(29);
        b.setOrganization("IT");
        b.getUser().setAge(32);
        b.getUser().setName("Orepator");

        System.out.println(c.toString());
        System.out.println(b.toString());
    }

}
