
//        Arrays[] Char;
//        Char = new Arrays[];
//        char[] digits = String.valueOf(x).toCharArray();
import java.util.Arrays;

public class Palindrom {

    static int pali(int x){
    int reversedNumber = 0;
        while(x != 0) {
        reversedNumber = reversedNumber * 10 + x % 10;
        x /= 10;
    }
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    public static void main(String[] args) {
        pali(2255);
     }
}
