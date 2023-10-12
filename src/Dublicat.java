import java.util.ArrayList;
import java.util.LinkedList;

public class Dublicat {
    public static int singleNumber(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            else list.remove(Integer.valueOf(nums[i]));
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,3,2,2,1}));
    }
}
