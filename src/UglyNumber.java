import java.util.ArrayList;

public class UglyNumber {
            public static int addDigits(int num) {
                int x=second(num);
                while (x>9) {
                    x = second(x);
                }
                return x;
            }
            public static int second (int ans) {
                int b = 0;
                while (ans > 0) {
                    b = b + ans % 10;
                    ans = ans / 10;
        }
        return b;
    }

}
