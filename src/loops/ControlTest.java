package loops;

/**
 * Created by a.markov on 8/28/2015.
 */
public class ControlTest {
    public static void main(String[] args){
        System.out.println("Attention! - Sales!");
        double d =100; // demand
        double s = 50; //supply
        double p = 10; //price
        double a = .1; //raise
        double b = .2; //raise

        if (d==s){
            System.out.println("Don't do anything! Price = " + p);
        } else {
            p = d > s ? (a*(d-s)):(b*(s-d));
            System.out.println("Price = " + p);
        }

    }
}


