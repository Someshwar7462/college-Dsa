package AMCAT;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(String.valueOf(a.charAt(i))))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("abcd","cdba"));
    }
}
