package String;


public class Complement {
    public static void main(String[] args){
        StringBuffer input = new StringBuffer("ACGGAT");
        System.out.print(input + " Complement to: ");

        StringBuffer revers = input.reverse();
        StringBuffer compl;

        char ch[] = new char[input.length()-1];
        revers.getChars(0, revers.length()-1, ch, 0);
        System.out.print(ch);

        int start = input.length()-1;
        int end = start;
       // revers.replace(start, end, gen);
        for (int i = input.length()-1; i <= 0; i--){
            char tmp = ch[i];
            switch (tmp) {
                case 'A': revers.replace(i, i, "T");
                    break;
                case 'T': revers.replace(i, i, "A");
                    break;
                case 'C': revers.replace(i, i, "G");
                    break;
                case 'G': revers.replace(i, i, "C");
                    break;
                }
                ch[i]--;
            System.out.println(ch[i]);


        }



    }
}




