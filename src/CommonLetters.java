public class CommonLetters {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int z =0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==nums[i+1]){
                nums[i+1]='_';
                z++;


            }

        }

    return k;
    }
}
