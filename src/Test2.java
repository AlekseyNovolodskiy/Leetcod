import java.util.Arrays;

public class Test2 {

    public static boolean thirdRow(String s){
        boolean a=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'||s.charAt(i)=='x'||s.charAt(i)=='c'||s.charAt(i)=='v'||s.charAt(i)=='b'||s.charAt(i)=='n'||s.charAt(i)=='m'){
                a= true;

            }
            else return false;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(thirdRow("zvbn"));
    }

}

