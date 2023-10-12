import java.util.*;

public class FindTheDifference {
    static Map<Character,Integer> map= new HashMap<Character,Integer>();
        public static  char findTheDifference(String s, String t) {



            for(int i=0; i<t.length();i++){
                char c=t.charAt(i);
                if(!map.containsKey(c)){
                map.put(c,1);}
                else map.put(c,map.get(c)+1);
            }
            System.out.println(map);
            for(int i=0; i<s.length();i++){
                char c=s.charAt(i);
                if(map.containsKey(c)&&map.get(c)>0){
                    map.put(c,map.get(c)-1);}

            }
            System.out.println(map);

            return 'c';
        }



    public static void main(String[] args) {
        System.out.println(findTheDifference("a","aa"));
    }



}
