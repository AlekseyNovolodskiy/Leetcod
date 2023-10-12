import java.util.ArrayList;
import java.util.Arrays;

public class isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int first = 0;
        int second = 0;
        StringBuilder test=new StringBuilder();
        while (first < chars.length && second < chart.length) {
            if (chars[first] == chart[second]) {

                test.append(chars[first]);
                first++;
                second++;
            } else
                second++;
        }
        if(s.equals(test.toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "agbtc"));

    }
}
