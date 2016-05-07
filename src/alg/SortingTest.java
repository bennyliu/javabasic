package alg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by bliu13 on 1/14/2016.
 */
public class SortingTest {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] c = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] d = {5, 4, 3, 7, 9, 8, 1, 6, 2, 10};

        ArrayList<Long> s = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            s.add(Math.abs(rand.nextLong()%2000));

        }

        ArrayList<Long> m = new ArrayList<Long>();
        for (int i = 0; i < 100; i++) {
            m.add(Math.abs(rand.nextLong()%2000L));

        }

        ArrayList<Long> mm = new ArrayList<Long>();
        mm.add(4L);
        mm.add(7L);
        mm.add(1L);

        mm.add(7L);

        mm.add(4L);
        mm.add(9L);

        mm.add(5L);

        mm.add(11L);


        mm.add(11L);

        mm.add(9L);

        mm.add(4L);

        mm.add(9L);

        mm.add(9L);

        mm.add(9L);

        mm.add(4L);

SortingUtils.sort_fast(m);
        SortingUtils.sort_bubble(s);
    }

}
