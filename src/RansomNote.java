import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 1);
            else {
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
        for (int j = 0; j < ransomNote.length(); j++) {
            char d = ransomNote.charAt(j);
            if (map.containsKey(d) && map.get(d) > 0) {
                map.put(d, map.get(d) - 1);
            } else return false;
        }
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
