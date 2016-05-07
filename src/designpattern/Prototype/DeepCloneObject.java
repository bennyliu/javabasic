package designpattern.Prototype;

/**
 * Created by bliu13 on 7/5/2015.
 */
public class DeepCloneObject implements Cloneable{

    private String organization;
    private int salary_grade;

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getSalary_grade() {
        return salary_grade;
    }

    public void setSalary_grade(int salary_grade) {
        this.salary_grade = salary_grade;
    }

    public CloneObject getUser() {
        return user;
    }

    public void setUser(CloneObject user) {
        this.user = user;
    }

    private CloneObject user;


    public DeepCloneObject() {
        this.organization = "";
        this.salary_grade = 0;
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "organization='" + organization + '\'' +
                ", salary_grade=" + salary_grade + '\'' +
                ",user=" + user.toString() +
                '}';
    }

    public DeepCloneObject(String organization, int salary_grade, CloneObject user) {
        this.organization = organization;
        this.salary_grade = salary_grade;
        this.user = user;
    }


    public Object clone(){

        DeepCloneObject d = null;
        CloneObject c = null;
        try{
            d = (DeepCloneObject)super.clone();
            c = (CloneObject)this.getUser().clone();
            d.setUser(c);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return d;
    }


}
