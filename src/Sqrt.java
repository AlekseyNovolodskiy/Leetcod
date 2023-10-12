public class Sqrt {

        public static int mySqrt(int x) {
            long a=0;

            while( (a*a)<x){
                a++;
                if ((a*a)>x)
                    break;
            }
            if ((a*a)==x)
return (int) a;
            else return (int) (a-1);
        }

    public static void main(String[] args) {
        System.out.println(mySqrt(2121212122));
    }

}
