package tt.annotationt;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bliu13 on 10/27/2015.
 */
public class Apple {
    @FruitName(value="Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;




    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }


    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void displayName(){
        System.out.println("Name: = " + this.getAppleName() + "    Color:= " + this.getAppleColor());
    }

    public Apple(){
        System.out.println("----------");
        Annotation[] ans = Apple.class.getAnnotations();
        for(Annotation an:ans){
            System.out.println(an.toString());
        }


        Annotation[] ans2 = Apple.class.getAnnotations();
        for(Annotation an:ans2){
            System.out.println(an.toString());
        }



    }

    public static void main(String[] args){
        //Apple apple = new Apple();
        //apple.displayName();
        List<Map<String,String>> nulltesting = new ArrayList<Map<String,String>>();
        Map<String,String> mmp = new HashMap<String,String>();
        //nulltesting.add(null);

        nulltesting.add(mmp);
        mmp.put(null,null);
        //mmp.put("h","k");
        if(nulltesting == null){

            System.out.println("null");
        } else if(nulltesting.isEmpty()){

            System.out.println("isEmpty");
        } else if(nulltesting.get(0) == null){
            System.out.println("null include");
        }else if(nulltesting.get(0).isEmpty()){
            System.out.println("map is empty");
        }else if(nulltesting.get(0).entrySet().size() == 0){
            System.out.println("0 map");
        }else if(nulltesting.get(0).get(null) == null){
            System.out.println("null map");
        }
    }
}
