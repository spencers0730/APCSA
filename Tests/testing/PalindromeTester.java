package testing;

import java.util.Scanner;
public class PalindromeTester{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("Enter a word:");
            String word = scan.next().toLowerCase();
            System.out.println(word + " is " + 
                ((isPalindrome(word)) ? "" : "not ") + "a palindrome.");
                System.out.println("Again?");
            run = scan.next().charAt(0) == 'y';
        }
    }
    
    public static boolean isPalindrome(String str){
        if(str.length() <= 1) return true;
        if(str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }
}