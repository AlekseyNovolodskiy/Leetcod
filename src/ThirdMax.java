import java.util.*;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int iterator: nums) {
            arr.add(iterator);
        }
        int counter=0;
        while(!arr.isEmpty()&&counter<=2){
            if(set.contains(Collections.max(arr)))
                counter --;
            set.add(Collections.max(arr));
            arr.remove(Collections.max(arr));
                 counter++;
            System.out.println(set);
        }
        if(set.size()==3)
            return Collections.min(set);
        else return Collections.max(set);


    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
}
