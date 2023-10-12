public class ValidParentess {
    static public boolean isValid(String s) {
        char[] carray = s.toCharArray();
         boolean a = false;
        int x;
        for (int i = 0; i < carray.length ; i++) {

            x=i+i+1;
            a=true;


          //  if(i+x< carray.length){

            if (carray[i] == '(' && carray[i + 1] != ')' ) {
                a = false;
            } else if (carray[i] == '[' && carray[i + 1] != ']'  ) {
                a = false;
            } else if (carray[i] == '{' && carray[i + 1] != '}' ) {
                a = false ;
            }
//        }
    }
        if ( carray.length%2==1)
            a=false;
        return a;
    }
    public static void main(String[] args) {
        System.out.println(isValid("[]()}}"));

    }

}
