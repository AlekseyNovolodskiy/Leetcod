import java.util.Arrays;

public class FotmatText {
    public static String[] splitMethod(String str) {
        String[] arrayList;
        arrayList = str.split(" ");
        return arrayList;
    }

    public static int findMax(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max)
                max = str[i].length();
        }
        return max;
    }

    public static void formatMethod(String string) {
        String[] strarray = splitMethod(string);
        int length = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strarray.length; i++) {
            if ((strarray[i].length() + sb.length()) <= findMax(strarray) * 3) {
                sb.append(strarray[i]);
            } else {
                System.out.println(sb);
                sb.delete(0, sb.length());
            }

        }
        System.out.println(sb);


    }

    public static void main(String[] args) {
        
    }
}
