import java.util.*;
public class PalindromeStr {

    public static boolean isPalindrome(String str) {
        int left=0;
        int right=str.length()-1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
         return true; 
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = s.nextLine();
        
        if (isPalindrome(a)) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }
    }
    
    
}
