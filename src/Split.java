public class Split {
    static void str (String s){

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.print(word+":");
        }
    }

    public static void main(String[] args) {
        str("Нам нужно разбить строку на слова. Мы видим, что в данной строке слова разделены друг от друга пробелами. Пробел — идеальный кандидат на роль разделителя в данном случае. ");
    }
}
