import java.util.Arrays;
public class MergeArrays {

        public static void merge(int[] nums1, int[] nums2) {
            for(int i =0; i<=nums2.length-1;i++){
                nums1[nums1.length-1-i] = nums2[i];
            }
        Arrays.sort(nums1);
        }

    public static void main(String[] args) {
        merge(new int[]{1, 2,4, 0}, new int[]{1});
    }

}
