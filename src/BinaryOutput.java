public class BinaryOutput {

            public static String addBinary(String a, String b) {
                String t = Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
        return t;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1110111111111101000000101111001110001111100001101","011011011001011101111001100000011011110011"));
    }

            }

