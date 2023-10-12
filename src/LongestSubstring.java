import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> pool = new ArrayList<>();

        if(s.equals("")) return 0;
        int index = 0;
        int lastindex = s.length();

        while (index < s.length()) {
            for (int i = s.length(); i > index; i--) {    //pwwkew
                if (test(s.substring(index, lastindex))) {
                    lastindex--;
                    pool.add(lastindex - index + 1);
                } else {
                    lastindex--;
                }
            }
            lastindex = s.length();
            index++;
        }
        return Collections.max(pool);
    }

    public static boolean test(String b) {
        for (int i = 0; i < b.length(); i++) {
            if (b.indexOf(b.charAt(i)) != b.lastIndexOf(b.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
