import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

        public static List<String> fizzBuzz(int n) {
            ArrayList<String> List = new ArrayList();
            for (int i = 1; i <= n; i++) {
                if (i % 3 != 0 && i % 5 != 0)
                    List.add(String.valueOf(i));
                if (i % 3 == 0 && i % 5 != 0)
                    List.add("Fizz");
                if (i%3!=0&&i%5==0)
                    List.add("Buzz");
                if (i % 3 == 0 && i % 5 == 0)
                    List.add("FizzBuzz");
            }


            return List;
        }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(6));
    }
}
