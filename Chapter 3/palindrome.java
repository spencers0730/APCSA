import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("Enter word:");
            String str = scan.nextLine();
            if(str.length() == 0) run = false;
            else {
                boolean is = isPalindrome(str);
                String out = str + " is "; 
                out += (is) ? "" : "not ";
                out += "a palindrome.";
                System.out.println(out);
            }
        }
    }
    
    static boolean isPalindrome(String str){
        boolean ends = str.charAt(0) == str.charAt(str.length() - 1);
        if(str.length() <= 2) return ends;
        else return ends && isPalindrome(str.substring(1, str.length() - 1));
    }
}