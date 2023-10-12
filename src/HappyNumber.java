import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> srr = new HashSet<Integer>();
        while( n!=1 && !srr.contains(n)) {
            srr.add(n);
            n=sum(n);
        }
        return n==1;

        }
    public  static int sum(int n){
        int summa =0;
        while(n>0){
            int d=n%10;
            summa=summa+(d*d);
            n=n/10;
        }
        return summa;

    }

}
