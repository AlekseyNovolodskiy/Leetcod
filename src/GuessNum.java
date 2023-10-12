import java.util.Random;

public class GuessNum {
    public static int guessNumber(int n) {
        int x=10;
       int s=guess();

        while(x!=s){

            if(x<s)
                x++;
            else
                x--;
        }
        return x;
    }
    public static int guess(){

        int a = (int) (Math.random()*10);
        int i = (int) a;
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(5));
    }
}
