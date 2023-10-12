import java.util.ArrayList;
import java.util.Arrays;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        int[] myArray = new int[pattern.length()];
        int[] myArray2 = new int[pattern.length()];
        String[] sarray = s.split(" ");
        if (pattern.length() != sarray.length)
            return false;
        char[] mychar = pattern.toCharArray();

        for (int i = 0; i < sarray.length; i++) {

            for (int j = 0; j < sarray.length; j++) {
                if (mychar[j] == pattern.charAt(i)) {
                    myArray2[j] = i;
                }

                if (sarray[j].equals(sarray[i])) {
                    myArray[j] = i;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));
        if (Arrays.equals(myArray, myArray2))
            return true;
        else return false;


    }


    public static void main(String[] args) {
        System.out.println(wordPattern("abca", "dog cat fish dog"));
    }
}
