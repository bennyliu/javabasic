package alg;

/**
 * Created by bliu13 on 10/13/2015.
 */
public class GenerateNewPosition {

    int no_stacks = 9;
    int total_size = 100;
    int[] top;
    int[] oldtop;
    int[] base;
    int[] newbase;
    int[] storage;
    int[] inc;

    GenerateNewPosition(){
        top = new int[no_stacks];
        base = new int[no_stacks];
        newbase = new int[no_stacks];
        oldtop = new int[no_stacks];

        inc = new int[no_stacks];
        storage = new int[total_size];
        int init_size_staak = total_size/no_stacks;
        for(int i = 0; i < no_stacks - 1; i++){
            base[i] = 0 + i * init_size_staak;
            top[i] = base[i];
            oldtop[i] = base[i];
        }

    }

    public void instert(int stack, int value){
        if(0> stack || stack > no_stacks - 1){
            System.out.println("Stack No. : " + stack + " does not exist.  Please try insert into stack 0 - 8. This item is been ignored.");
        }
        int ceilling_number = total_size - 1;
        if(stack < no_stacks - 1){
            ceilling_number = base[stack + 1];
        }

        if(top[stack] + 1 < ceilling_number){
            top[stack] = top[stack] + 1;
            storage[top[stack]] = value;
        }else{
            //overflow
            boolean storage_overflow = true;
            for(int i = 0; i < no_stacks - 2 && true == storage_overflow; i++){
                if(top[i] + 1 < base[i + 1]){
                    storage_overflow = false;
                }
            }

            if(true == storage_overflow){
                if(top[no_stacks - 1] + 1 < total_size - 1){
                    storage_overflow = false;
                }
            }

            if(true == storage_overflow){
                regenerate(stack);
                //reallocate();
            }
            top[stack] = top[stack] + 1;
            storage[top[stack]] = value;
        }

    }

    public void regenerate(int cause_stack){
        for(int i = 0; i < no_stacks ; i++){
            inc[i] = top[i] - oldtop[i];
        }
        inc[cause_stack] = inc[cause_stack] + 1;
        newbase[0] = base[0];
    }

    public static void main(String args[]){


    }
}
