package String;


public class NoDuplicates {
    public static void main(String[] args) {

        String source = "AABBCCCCCBBAB";
        char[] dst = new char[14];

        int srcEnd = source.length();

        source.getChars(0, srcEnd, dst, 0);

        char compare = 1;
        int tmp = 0;
        for (int i = 0; i < source.length(); i++) {

            boolean res = compare == dst[tmp];
            if (res != true) {
                System.out.println(dst[tmp]);
                compare = dst[tmp];
                tmp++;
            } else {
                tmp++;
            }
        }


    }
}