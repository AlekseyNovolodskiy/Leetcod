import java.util.LinkedList;

public class Dublicat2 {
    public static int singleNumber(int[] nums) {
        int xor  = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor^nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,3,2,2}));
    }
}
