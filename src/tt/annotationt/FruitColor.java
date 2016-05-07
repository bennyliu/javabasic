package tt.annotationt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by bliu13 on 10/27/2015.
 */
@Target(ElementType.FIELD)
public @interface FruitColor {
    public enum Color{ BULE,RED,GREEN};

    Color fruitColor() default Color.GREEN;


}
