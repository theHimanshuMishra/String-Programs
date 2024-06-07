import java.util.Arrays;

public class AnagramPro {
    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "hearth";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() == str2.length()) {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean result = Arrays.equals(a, b);
            if (result) {
                System.out.println(str1+ " and " + str2 + "are anagrams of each other");
            } else {
                System.out.println(str1+ " and " + str2 + "are not anagrams of each other");
            }
        } else {
            System.out.println(str1+ " and " + str2 + "have different lengths,so they cannot be anagrams");
        }
    }
}
