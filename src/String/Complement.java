package String;


public class Complement {
    public static void main(String[] args){
        StringBuffer input = new StringBuffer("ACGGAT");
        System.out.print(input + " Complement to: ");
        StringBuffer revers = input.reverse();
        StringBuffer compl;

        char ch[] = new char[input.length()];
        int tmp = 0;
        for (int i = input.length()-1; i <= 0; i--){

            int start = input.length()-1;
            int end = start;

            ch gen;
            int genome = 4;

            switch (regenome) {
                case 1: if (revers.charAt(i) == 'A'){
                    revers.replace(i, i, (char)T);
                    break;
                }
                case 2: if (revers.charAt(i) == 'T'){
                    revers.replace(i, i, 'A');
                    break;
                }case 3: if (revers.charAt(i) == 'C'){
                    revers.replace(i, i, 'G');
                    break;
                }case 4: if (revers.charAt(i) == 'G'){
                    revers.replace(i, i, 'C');
                    break;
                }

            }
            revers.replace(start, end, gen);


        }


        System.out.print(input.reverse());


    }



}
