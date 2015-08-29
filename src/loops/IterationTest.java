package loops;

import java.util.ArrayList;

/**
 * Created by a.markov on 8/28/2015.
 */
public class IterationTest {
    public static void main(String[] args){

        int array[] = new int[47];
        int tmp = 0;
        for (int i = 0; i <= array.length-1; i++ ){
            tmp = tmp + array[i];
            System.out.println(tmp);
            //tmp = tmp + 2;
        }



        System.out.println("The End");
    }
}
