public class BestPrice {
    public static int maxProfit(int[] prices) {
        int t=0;
        int it = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }
        if((prices[i]-min)>t)
        t=prices[i]-min;
        }
        if(t>it){
            it=t;
        return it;}
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{5,4,3,2,1}));

    }
}
