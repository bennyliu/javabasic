package designpattern.Prototype;

/**
 * Created by bliu13 on 7/3/2015.
 */
public class CloneObject implements Cloneable{
    public String name;
    public int age;

    public CloneObject() {
        this.name = "";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public CloneObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone(){

        CloneObject c = null;
        try{
            c = (CloneObject)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return c;
    }

}
