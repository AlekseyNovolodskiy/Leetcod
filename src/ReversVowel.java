import java.util.Arrays;

public class ReversVowel {
    //    private  static final String vowels = "aoeuiy";
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char temp;
        int count = 0;

        char[] arraytemp = new char[s.length()];
        arraytemp = s.toCharArray();


        while (start < end) {
            if (!isVowel(arraytemp[start])) {

                start++;
            }
            else if (!isVowel(arraytemp[end])) {

                end--;
            }
            else {

                temp = arraytemp[start];
                arraytemp[start] = arraytemp[end];
                arraytemp[end] = temp;
                start++;
                end--;

            }

        }
        return new String(arraytemp);
    }
    public static boolean isVowel(char temp) {
        if(temp == 'a'|| temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A'|| temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(reverseVowels("hello"));
    }
}
