import java.util.ArrayList;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0; i<nums.length;i++){
           arrayList.add(nums[i]) ;
        }
        int b=nums.length+10;
        for (int i=0; i<nums.length; i++){
            if(!arrayList.contains(i))
                b=i;
        }
        if(b>nums.length)
            b=nums.length;
        return b;
    }
}
