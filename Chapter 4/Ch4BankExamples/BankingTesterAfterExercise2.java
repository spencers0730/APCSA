package Ch4BankExamples;


/**
 * Run this class after completing Exercise 4.2.
 * 
 * @Cullen 
 * @October 26, 2016
 * 
 * Your output should be as follows:
 * 
 * Gomez balance after deposit: 540.0
 * Gomez balance after withdrawal: 107.75

 * Error: Insufficient funds.
 * Account: 93757
 * Requested: $800.00
 * Available: $759.32

 * 72354   Ted Murphy  $132.90
 * 69713   Anita Gomez $111.52
 * 93757   Sanchit Reddy   $785.90
 * 12345   Michael Cullen  $0.00

 */
public class BankingTesterAfterExercise2
{
    public static void main ()
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      Account acct4 = new Account ("Michael Cullen", 12345);

      acct1.deposit (25.85);

      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: " +
                          gomezBalance);

      System.out.println ("Gomez balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));

      acct3.withdraw (800.00, 0.0);  // exceeds balance

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      System.out.println (acct4);
   }
}
