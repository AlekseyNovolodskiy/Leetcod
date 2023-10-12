import java.util.Arrays;

public class ReversString2 {
    public static String reverseStr(String s, int k) {
        StringBuilder d = new StringBuilder();
        int u = 0;
        for (int i = 0; i < s.length(); i += k) {
            if (i + k > s.length() && u % 2 == 0) {
                d.append(revers(s.substring(i, s.length())));

            } else if (u % 2 == 0) {
                d.append(revers(s.substring(i, i + k)));
            } else {
                d.append(s.substring(i, Math.min(i + k, s.length())));
            }
            u++;
        }
        return d.toString();
    }

    public static String revers(String d) {
        StringBuilder w = new StringBuilder();
        char[] chard = d.toCharArray();
        int start = 0;
        int end = d.length() - 1;
        char temp;
        while (start < end) {
            temp = chard[start];
            chard[start] = chard[end];
            chard[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i < d.length(); i++)
            w.append(chard[i]);
        return w.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
