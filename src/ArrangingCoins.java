public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int rows=0;
        int count=0;
        while(n-rows>0){
            rows++;
            count++;
            n=n-rows;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
