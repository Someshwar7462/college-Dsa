package AMCAT;

public class decimaltobinary {
    public static String decimalToBinary(int num) {
        String bin = "";
        while (num != 0) {
            bin = (num % 2) + bin;
            num /= 2;
        }
        return bin.isEmpty() ? "0" : bin;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(12));
    }
}
