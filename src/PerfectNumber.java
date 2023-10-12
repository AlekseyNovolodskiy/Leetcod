public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int count = 0;
        int i=1;
            while(i<=num/2){
                if(num%i==0) {
                    count += i;
                    System.out.println(i);
                }
                i++;
            }
            return count==num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
