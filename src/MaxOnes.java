import java.util.ArrayList;
import java.util.Collections;

public class MaxOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                count++;

            }
            if (nums[i] == 0) {

                list.add(count);
                count = 0;
            }
        }
        return Math.max(Collections.max(list),count);
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1}));
    }
}
