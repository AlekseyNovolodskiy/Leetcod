public class ReversString {
    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        char temp;
        while(start<end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {

    }

}
