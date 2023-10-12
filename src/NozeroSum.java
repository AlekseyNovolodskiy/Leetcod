import java.util.Arrays;

public class NozeroSum {
    public static int[] getNoZeroIntegers(int n) {

    return new int[]{1,n-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(4)));
    }
}
