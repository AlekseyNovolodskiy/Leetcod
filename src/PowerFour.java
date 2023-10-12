public class PowerFour {
    public static boolean isPowerOfFour(int n) {
        if (n==1)
            return true;
        if(n%4!=0)
            return false;
        if(n<0||n==0)
            return false;

        if((n&(n-1))==0)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(32));
    }
}
