package alg;

import java.util.ArrayList;

/**
 * Created by bliu13 on 1/20/2016.
 */
public class SortingUtils {

    public static<T extends Comparable> void sort_fast(ArrayList<T> a) {

        System.out.print("Before Sorting a:");
        for (T i : a) {
            System.out.print(i + " ,");
        }
        System.out.println();
        long timebegin = System.currentTimeMillis();

        sorting_fast(a, 0, a.size() - 1);
        long timeend = System.currentTimeMillis();
        System.out.print("After  Sorting a:");
        for (T i : a) {
            System.out.print(i + " ,");
        }
        System.out.println();


        System.out.println("FAST Sorting cost:  " + (timeend - timebegin) + "ms");
    }

    public static<T extends Comparable> void sort_bubble(ArrayList<T> a) {

        System.out.print("Before Sorting a:");
        for (T i : a) {
            System.out.print(i + " ,");
        }
        System.out.println();
        long timebegin = System.currentTimeMillis();

        sorting_bubble(a, 0, a.size() - 1);
        long timeend = System.currentTimeMillis();
        System.out.print("After  Sorting a:");
        for (T i : a) {
            System.out.print(i + " ,");
        }
        System.out.println();


        System.out.println("Bubble Sorting cost:  " + (timeend - timebegin) + "ms");
    }

    private static <T extends Comparable> void sorting_fast(ArrayList<T> target, int start, int end) {

        if (target == null) {
            return;
        }
        if (start >= end) {
            return;
        }
        int low = start;
        int high = end;
        T comp_number = target.get(low);

        while (low < high) {
            while (low < high && target.get(high).compareTo(comp_number) > 0) {
                high--;
            }
            target.set(low, target.get(high));

            while (low < high && target.get(low).compareTo(comp_number) <= 0) {
                low++;
            }
            target.set(high, target.get(low));
            target.set(low, comp_number);
        }
        sorting_fast(target, start, low - 1);
        sorting_fast(target, low + 1, end);

    }


    private static <T extends Comparable> void sorting_bubble(ArrayList<T> target, int start, int end) {

        if (target == null) {
            return;
        }
        if (start >= end) {
            return;
        }

        for(int i = start; i <= end; i++){

            int index = i;

            for(int j = i; j <=end; j++){
                if(target.get(j).compareTo(target.get(i)) >= 0){

                }else{
                    index = j;
                }
            }
            T temp = target.get(i);
            target.set(i,target.get(index));
            target.set(index,temp);
        }

    }



}
