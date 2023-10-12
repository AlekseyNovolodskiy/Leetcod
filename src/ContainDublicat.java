import java.util.HashSet;
import java.util.Set;

public class ContainDublicat {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> srr = new HashSet<Integer>();
        for(int i=0; i< nums.length;i++){
            if(!srr.contains(nums[i])){
                srr.add(nums[i]);
            }

            else return true;
        }
        return false;
    }
}
