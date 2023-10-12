public class NumberComplement {
    public static  int findComplement(int num) {
        int x =~num;
        StringBuilder a = new StringBuilder();
        String num1 =Integer.toBinaryString(num);
        a= new StringBuilder(Integer.toBinaryString(x));
        a.delete(0,a.length()-num1.length());
        int i = Integer.parseInt(a.toString(),2);

        return i;

    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
