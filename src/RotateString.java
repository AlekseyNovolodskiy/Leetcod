import java.util.Arrays;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        char[] sChar = s.toCharArray();
        char[] sgoal = goal.toCharArray();
        for(int i=0; i< sChar.length;i++){
            if(Arrays.toString(sChar).equals(Arrays.toString(sgoal)))
                return true;
            char temp =sChar[sChar.length-1];
            for(int j=s.length()-1;j>0;j--){
                sChar[j]=sChar[j-1];
            }
            sChar[0]=temp;
            System.out.println(Arrays.toString(sChar));
        }

    return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcd","cdab"));
    }
}
