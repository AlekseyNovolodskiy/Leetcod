import java.util.Arrays;

public class InsertionSort {
    public static void insertion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i -1;
            while (j >= 0 && current < array[j]) {
                array[j+1 ] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 80, 9};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

}
