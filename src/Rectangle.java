
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rectangle {
    public static int[] constructRectangle(int area) {
        int l=1;
        int w=area;
        for(double i=1;i<=area/2;i++){
           if((area/i)%1==0&&(Math.abs(i-(area / i)) <Math.abs(l - w))&&l!=w) {
               w=(int)i;
               l=(int)(area/i);
           }
        }
        return new int[]{Math.max(l,w),Math.min(l,w)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }
}
