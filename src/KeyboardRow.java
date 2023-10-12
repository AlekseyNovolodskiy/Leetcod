import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        ArrayList<String>news=new ArrayList<>();

        for(int i=0; i<words.length;i++){

            String d=words[i].toLowerCase();
            if(firstRow(d)||secondRow(d)||thirdRow(d)){
              news.add(words[i]);

            }
        }
        return news.toArray(new String[news.size()]);
    }
    public static boolean firstRow(String s){
        boolean a = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='q'||s.charAt(i)=='w'||s.charAt(i)=='e'||s.charAt(i)=='r'||s.charAt(i)=='t'||s.charAt(i)=='y'||s.charAt(i)=='u'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='p'){
                a= true;
            }
            else return false;
        }
        return a;

    }
    public static boolean secondRow(String s){
        boolean a = true;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a'||s.charAt(i)=='s'||s.charAt(i)=='d'||s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l'){
                a=true;
            }
            else return false;

        }
        return a;
    }
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
        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
    }
}