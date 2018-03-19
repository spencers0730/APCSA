public class Palindrome {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        if(s.length() <= 1)
            return true;
        return s.substring(0, 1).equals(s.substring(s.length()-1)) && isPalindrome(s.substring(1, s.length()-1));
    }
}

