
/**
 * Run this tester class to check your palindrome program
 * 
 * Lesson 8.1 
 * February 19, 2015
 */
public class Tester
{
    public static void main()
    {
      String[] input={"racecar","abccba","Cedarburg", "Bulldogs", "A Toyotas a Toyota", "AToyotasaToyota","Your program works with spaces secaps htiw skrow margorp ruoy"};
      
      boolean result0=Palindrome.testPalindrome(input[0]);
      boolean result1=Palindrome.testPalindrome(input[1]);
      boolean result2=Palindrome.testPalindrome(input[2]);
      boolean result3=Palindrome.testPalindrome(input[3]);
      boolean result4=Palindrome.testPalindrome(input[4]);
      boolean result5=Palindrome.testPalindrome(input[5]);
      boolean result6=Palindrome.testPalindrome(input[6]);
      
      System.out.println("The string \""+input[0]+ "\" should have returned TRUE and yours returned "+result0);
      System.out.println("The string \""+input[1]+ "\" should have returned TRUE and yours returned "+result1);
      System.out.println("The string \""+input[2]+ "\" should have returned FALSE and yours returned "+result2);
      System.out.println("The string \""+input[3]+ "\" should have returned FALSE and yours returned "+result3);
      System.out.println("The string \""+input[4]+ "\" should have returned FALSE and yours returned "+result4);
      System.out.println("The string \""+input[5]+ "\" should have returned TRUE and yours returned "+result5);
      System.out.println("The string \""+input[6]+ "\" should have returned TRUE and yours returned "+result6);
    }
}
