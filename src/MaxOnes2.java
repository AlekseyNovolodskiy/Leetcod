import java.util.ArrayList;
import java.util.Collections;

public class MaxOnes2 {
    public static boolean maxPower(String s) {
        int count1=0;
        int count0=0;

        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list0.add(0);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') {
                count1++;
                list0.add(count0);

                count0=0;

            }
            if (s.charAt(i) == '0') {
                count0++;

                list1.add(count1);
                count1 = 0;
            }
        }
        return Math.max(Collections.max(list1),count1)>Math.max(Collections.max(list0),count0);
    }

    public static void main(String[] args) {
        System.out.println(maxPower("1011"));
    }
}
