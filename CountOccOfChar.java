public class CountOccOfChar {
    public static int count(String s, char ch)
    {
        int count = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == ch)
            count++;
        } 
        return count;
    }
     
    public static void main(String args[])
    {
        String str= "himanshumishra";
        char ch = 'h';
        System.out.println(count(str,ch));
    }
}
