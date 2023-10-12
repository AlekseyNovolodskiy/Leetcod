import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] myarray = new int[n+1];

        for (int i = 0; i <= n; i++) {
            String t = Integer.toBinaryString(i);

            int counter = 0;
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == '1') {
                    counter++;
                }

                System.out.println(counter);
            }
            myarray[i] = counter;
        }
        return myarray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
}
