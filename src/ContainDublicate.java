import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContainDublicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap srr = new HashMap();
        int a=0;
        for(int i =0;i< nums.length;i++){

            if(!srr.containsValue(nums[i]))
                srr.put(nums[i],i);

            else
                a= (int) srr.get(nums[i]);
            if((a-i)<=k)
                return true;
            srr.put(nums[i],i);


            System.out.println(a);
            }
        System.out.println(srr);
        return false;
        }



    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
}
