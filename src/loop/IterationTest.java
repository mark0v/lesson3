package loop;

public class IterationTest {
    public static void main(String[] args){

        int array[] = new int[50];
        int tmp = 0;
        for (int i = 0; i<= array.length-1; i++ ){
            array[i] = array[i] + tmp;

            if(tmp>10 && tmp<47){
                System.out.print(tmp);

                if (array[i]%2!=0){
                    System.out.println(" - Is oven");
                } else {
                System.out.println(" - Is odd");
                }
            }
            tmp = tmp+3;
    }
}}
