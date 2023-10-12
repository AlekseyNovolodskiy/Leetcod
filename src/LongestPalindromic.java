import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestPalindromic {
    public static int lengthOfLongestPalindrom(String s) {
        int counter = 0;
        int counter2 = 0;
        int ans = 0;
        int[] array = new int[256];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'A']++;
        }

        for (int i = 0; i < array.length; i++) {

            if (counter == 0 && array[i] > 2 && array[i] % 2 != 0) {
                ans += array[i];
                counter++;
                System.out.println("ans raven 3 odina raz "+ans);
            } else if (counter > 0 && array[i] > 2 && array[i] % 2 != 0) {
                ans =ans+ array[i]-1;
                System.out.println("anss"+ans);
            }

            if (array[i] == 1 && counter == 0) {
                ans += 1;
                counter++;
                System.out.println("ans raven 1 "+ans);
            }

            if (array[i] % 2 == 0&&array[i]!=0) {
                ans += array[i];
                System.out.println(ans);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestPalindrom("ccc"));

    }
}
