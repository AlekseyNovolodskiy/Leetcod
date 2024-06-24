public class ReverseInteger {
    public static int reverseBits(int n) {
        StringBuilder t = new StringBuilder(Long.toBinaryString(n));
        int re = Integer.valueOf(t.toString(),2);
        System.out.println(t.reverse());
        StringBuilder db = t.reverse();
        System.out.println(db);
//        long x = Long.parseLong(db, 2);
           return 2;

    }
    public static int reverseBits2(int n) {
        String S= Integer.toBinaryString(n);
        String s2="";
        char arr[]=S.toCharArray();
        for(int i=S.length()-1;i>=0;i--){
            s2+=arr[i];
        }
        if(S.length()<32){
            for(int i=0;i<32-S.length();i++){
                s2+='0';
            }
        }
        System.out.println(arr);
        long x = Long.parseLong(s2, 2);
//        System.out.println(x);
        return (int)x;
    }

    public static void main(String[] args) {
        reverseBits2(23);
        reverseBits(23);

    }
}
