

public class Palindrom2 {

        public static boolean isPalindrome(String s) {

            String w=s.replaceAll("\\p{Punct}", " ").replaceAll(" ", "").toLowerCase();

            if (w.length() <= 1) {
                return   true;
            }

            int i =0;
            int j=w.length()-1;
           while(i< j)
           {if(w.charAt(i)!=w.charAt(j)) {
               return false;
           }
               i++;
               j--;
           }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
        
