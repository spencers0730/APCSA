public class Palindrome{

    public static boolean testPalindrome(String s){
        s = s.toLowerCase();
        if(s.length() <= 1)
            return true;
        return firstAndLast(s) && testPalindrome(s.substring(1, s.length() - 1));
    }

    public static boolean firstAndLast(String s){
        return s.substring(0, 1).equals(s.substring(s.length()-1));
    }
}
