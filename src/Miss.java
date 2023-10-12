import java.util.ArrayList;

public class Miss {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        System.out.println(sum);
        for(int i=0; i<nums.length;i++){
            sum=sum-nums[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        missingNumber(new int[]{3,0,1});
    }
}
