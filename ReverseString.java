import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = r.nextLine();

        System.out.print("Enter String: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        System.out.print("Reversed string: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }
}

