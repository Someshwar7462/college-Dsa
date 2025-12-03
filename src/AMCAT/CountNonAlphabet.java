package AMCAT;

public class CountNonAlphabet {
    public static int countSymbols(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!(Character.isLetter(c)))
                count += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSymbols("1234asdfg456"));

    }
}
