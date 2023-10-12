public class SummaKvadratov {
    static public boolean summaKvadratov(int n){
        for(int i=0; i<=Math.sqrt(n); i++){
            for(int j=0; j<=Math.sqrt(n); j++){
                if((i*i+j*j)==n)

                    return true;
                System.out.println(i+" " +j);

            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(summaKvadratov(13));
    }
}
