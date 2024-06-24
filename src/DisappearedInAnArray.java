import java.util.*;

public class DisappearedInAnArray {
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List list = new ArrayList();
//        Arrays.sort(nums);
//        for (int i=0; i<nums.length-1;i++){
//            if(nums[i]-nums[i+1]>2){
//                list.add((nums[i+1]-1));
//            }
//        }
//        return list;
//    }
//public static List<Integer> findDisappearedNumbers(int[] nums) {
//
//    int[] res = new int[nums.length + 1];
//
//    for (int num : nums) {
//        res[num] = num;
//        System.out.print(res[num]+" res["+num+"] ");
//
//    }
//    System.out.println(Arrays.toString(res));
//    List<Integer> result = new ArrayList<>(res.length);
//    for (int i = 1; i < res.length; i++) {
//        if (res[i] == 0) {
//
//            result.add(i);
//        }
//    }
//
//    return result;
//}
public  static List<Integer> findDisappearedNumbers(int[] nums) {
    boolean[] isAvailable = new boolean[nums.length];

    for(int i=0;i<nums.length;i++){
        isAvailable[nums[i]-1] = true;
        System.out.println(isAvailable[nums[i]]);
    }

    List<Integer> ans = new ArrayList<>();
    for(int i=0;i<isAvailable.length;i++){
        if(!isAvailable[i]){
            ans.add(i+1);
        }
    }
    return ans;
}
    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(num));
    }
}
