import java.util.Arrays;
public class PlusOne {
        static public int[] plusOne(int[] digits) {
            long plusone = 0;
            for (int i = 0; i <= digits.length - 1; i++)
                plusone = plusone * 10 + digits[i];

            plusone += 1;
           long [] myArray = new long[digits.length + 1];

            long t = plusone;
            for (int i = digits.length; i >= 0; i--) {
                myArray[i] = t % 10;
                t = t / 10;
            }
            int[]  arr2 = new int[myArray.length];
            int[]  arr3 = new int[myArray.length];

            for (int i=0;i<= myArray.length-1;i++)
                arr2[i]=(int)myArray[i];
            if (arr2[0] == 0)
                arr3 = Arrays.copyOfRange(arr2, 1, arr2.length );
            else return arr2;
            return arr3;
        }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3,9,9,9,9,9,9,9,9, 1,2,3,9,9,9,9,9}) ));
    }
}
