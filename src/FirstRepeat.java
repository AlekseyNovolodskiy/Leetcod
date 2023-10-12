import java.util.Arrays;

public class FirstRepeat {
    public static int firstUniqChar(String s) {

        char[] arr = s.toCharArray();
        int counter = 0;
        int b = 0;
        for (char i = 0; i < arr.length; i++) {
            char r = s.charAt(i);

            counter = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == r) {
                    b = j;
                    counter++;
                }
            }
            if (counter == 1)
                return b;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("novolodskii"));


    }
}