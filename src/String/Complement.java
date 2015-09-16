package String;


public class Complement {
    public static void main(String[] args){
        StringBuffer input = new StringBuffer("ACGGAT");

        System.out.print(input + " Complement to: ");

        StringBuffer revers = input.reverse();
        char ch[] = new char[input.length()-1];
        String str = String.valueOf(revers);
        ch = str.toCharArray();

        for (int i = 0; i <= 5; i++){
            char tmp = ch[i];

            switch (tmp) {
                case 'A': ch[i]= 'T';
                    break;
                case 'T': ch[i]= 'A';
                    break;
                case 'C': ch[i]= 'G';
                    break;
                case 'G': ch[i]= 'C';
                    break;
                }

            System.out.print(ch[i]);
        }
    }
}




