public class AddStrimg {
    public static String addStrings(String num1, String num2) {
        StringBuilder a = new StringBuilder();
        int temp = 0;
        int first = num1.length() - 1;
        int second = num2.length() - 1;
        int v1 = 0;
        while (first >= 0 || second >= 0) {
            int sum = 0;
            if (first >= 0) {
                sum =  num1.charAt(first) - 48 ;

                if(second<0&&temp>0)
                    sum++;
                if (sum >= 10) {
                    temp = 1;
                    sum = sum % 10;
                }
                first--;

            }
            if (second >= 0) {
                sum = sum + num2.charAt(second) - 48+temp;
                second--;
                temp=0;
                if (sum >= 10) {
                    temp = 1;
                    sum = sum % 10;
                }
            }

           a.insert(0, sum);


        }
       
        System.out.println(num1.charAt(0));
        System.out.println(num2.charAt(0));
        return a.toString();
    }

    public static void main(String[] args) {

        System.out.println(addStrings("6994", "26"));
    }
}
