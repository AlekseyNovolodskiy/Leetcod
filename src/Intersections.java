import java.util.Arrays;

public class Intersections {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first =0;
        int second = 0;
        int k=0;
        int[] ans = new int[nums1.length];
        while(first< nums1.length && second<nums2.length){
            if(nums1[first]<nums2[second])
                first++;
            else if (nums1[first]>nums2[second])
            second++;
            else {
                ans[k]=nums1[first];
                k++;
                first++;
                second++;
            }

        }
        return Arrays.copyOfRange(ans,0,k);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5},new int[]{9,4,9,8,4,5})));
    }
}
