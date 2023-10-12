public class Nim {
    public static boolean canWinNim(int n) {
        if(n==4)
            return false;
        if(n<=10)
            return true;

        int counter=0;
        while( n>4){
            n-=3;
            counter++;
            if(n==8||n==9||n==10)
                break;
        }
       if(counter%2==0)
           return false;
       else return true;

    }

    public static void main(String[] args) {
        System.out.println(canWinNim(8));
    }
}
