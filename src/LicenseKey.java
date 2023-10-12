public class LicenseKey {
    public static  String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase().replace("-","");
        StringBuilder newstring =new StringBuilder(s);
        int count=0;
        for(int j=s.length()-1;j>0;j--){
            count++;
            if(count==k){
                newstring.insert(j, '-');
            count=0;}
        }
        return newstring.toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J",2));
    }
}
