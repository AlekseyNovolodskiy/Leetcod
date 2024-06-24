public class ReverseInteger2 {
    public static int reverse(int x) {
        long y = 0;
        while(Math.abs(x)>0) {


            y = y * 10 + x % 10;
        x=x/10;

        }
        if(Math.abs(y)> Integer.MAX_VALUE){
            return 0;
        }
        return (int)y;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123456789));
    }
}
