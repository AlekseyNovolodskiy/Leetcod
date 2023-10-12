public class NumbersSegment {
    public static int countSegments(String s) {
        int counter=0;
        s=s.trim();
        System.out.println("1"+s+"1");
        if(s.equals(""))
            return 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==' ')
                counter++;
            System.out.println(counter);
        }
        if(counter==0)
            return 1;
        return counter+1;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("          "));

    }
}
