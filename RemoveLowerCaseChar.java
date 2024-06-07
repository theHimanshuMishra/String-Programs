public class RemoveLowerCaseChar {

    public static String removeLowercase(String str) {
        String result = "";
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (!Character.isLowerCase(ch)) {
                result += ch;
            }
        }
      return result;
     }
        public static void main(String[] args) {
            String s = "HiMansHuMishRa";
            String result = removeLowercase(s);
            System.out.println("Given string: "+s);
            System.out.println("String after removing lowercase letters: "+result);
        }
    
    }
    
