public class LagestOdd {
    public static String largestOddNumber(String num) {
        StringBuilder num2 = new StringBuilder(num);
        while (num2.length()>0){
            if(Long.parseLong(num2.toString())%2==0){
             num2.deleteCharAt(num2.length()-1);

            }
            else return num2.toString();
        }

        return "";

    }

    public static void main(String[] args) {

        System.out.println(largestOddNumber("7542351160"));
    }
}
