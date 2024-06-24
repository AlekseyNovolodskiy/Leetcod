import java.util.Arrays;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] arrs=new int[s.length()];
        int[] arrt=new int[t.length()];

        for(int i=0; i<t.length();i++){

            int counters=0;
            int countert=0;
            for(int j=0; j<t.length();j++){

               // t i t l e
                if(s.charAt(i)==s.charAt(j))
                    counters++;
                if(t.charAt(i)==t.charAt(j))
                    countert++;
                arrs[i]=counters;
                arrt[i]=countert;
            }
        }
        if(Arrays.equals(arrs,arrt))
            return true;
        else return false;

//"bbbaaaba"
//"aaabbbba"
    }
}
