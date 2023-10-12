import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestpalindromSubstring {
    public static String longestPalindrome(String s) {
         ArrayList<String> pool = new ArrayList<>();
        int index = 0;
        int lastindex = s.length();

        while (index < s.length()) {
            for (int i = s.length(); i > index; i--) {
                if (test(s.substring(index, lastindex))) {
                    lastindex--;
                    pool.add(s.substring(index, lastindex+1));

                } else {
                    lastindex--;
                }
            }
            lastindex = s.length();
            index++;
        }


        return Collections.max(pool, Comparator.comparing(d -> d.length()));
    }
    public static boolean test(String b) {
        int i = 0;
        int j = b.length() - 1;
        while (i < j) {
            if (b.charAt(i) != b.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("qkajbumzdzkiplmbcpnhbzweoevrvbptpozhtrfntszvnwbdahvkykmezrwruhvvslngruvwqebudtfxgpbmwefczwrecpqjegxkqknpobzkemmtruidulnxgntjxcmxtwmlxhzmbqfqylwvzjyojhfawwuupiipvxjiyxkqvsxbhgzzegfkdihizvjoxzrmeorikzsdyphbujaqmykrfblneqmwwxsoonzsgvligqxrrumspylfvquklbanjhkudlprwoycpxdsueokruoofyubirbhbyfuvgllijywuqmkcsfjttbnmelrylivkefllepgxnoeummujbaoyvryukyoumvuxezegpwgmwsupjuaarvbtbfmisrifjadqjypmzipvjysgakvjhfeaqwpsqijvqibshctuabwqqsjwotjopahoaptmxkwerkjkmwiodgblhtnhykzjuaoluoyokroxuvqtkpggfanzabgjejdfsgybhxbscubdpufywbxgutheskuhixasnksoayjngvhfoxxclykfobrwxjwgefarzczvptlfrgrtrjcemaeihpukhbeoezgvrwxgyhpkkfvmfvquwtswkdwqqgrgasopladdnteulqofmjhewpghkibbrewnhdllfppctgkfkoedoiwqocnpvfviochrokrgrzthrvyhqfsrzyyvqwkhuzsrkfaympcdodkwaojnghzytkhf"));
    }
}
