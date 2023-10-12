public class ReverseString3 {
    public static String reverseWords(String s) {
        StringBuilder d =new StringBuilder();
        String rev[]=s.split(" ");

        for(int i =0;i<rev.length;i++){
            if(i!=rev.length-1){
                d.append(revers2(rev[i]));
                d.append(" ");
            }
            else {
                d.append(revers2(rev[i]));
            }

        }
        return d.toString();
    }

    public static String revers2(String d) {
        StringBuilder w = new StringBuilder();
        char[] chard = d.toCharArray();
        int start = 0;
        int end = d.length() - 1;
        char temp;
        while (start < end) {
            temp = chard[start];
            chard[start] = chard[end];
            chard[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i < d.length(); i++)
            w.append(chard[i]);
        return w.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i feel goof"));
    }
}

