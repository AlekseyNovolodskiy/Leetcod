import java.util.Arrays;

public class PerfectSauare {
    public static boolean isPerfectSquare(int num) {
       int[] array=new int[46340+1];
       for(int i=0;i< array.length;i++){
           array[i]=i*i;
       }
       return Arrays.binarySearch(array,num)>0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147395600));
    }
}
