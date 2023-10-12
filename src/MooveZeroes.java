import java.util.Arrays;

public class MooveZeroes {

        public static void moveZeroes(int[] nums) {
         int num2[]=new int[nums.length];
         int j= nums.length-1;
         int x=0;
         for(int i=0; i<nums.length; i++){
             if(nums[i]==0){
                 num2[j]=nums[i];
                 j--;
             }
             if (nums[i]!=0){
                 num2[x]=nums[i];
                 x++;
             }

         }

        }

}
