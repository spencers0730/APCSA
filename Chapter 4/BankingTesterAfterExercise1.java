package Ch4BankExamples;

import java.text.NumberFormat;
/**
 * After completing Exercise 4.1, run this tester class.
 * 
 * @Cullen
 * @October 26, 2016
 * 
 * Your output should be
 * 
 * 
 * Obama balance after deposit: 5500.0
 * Obama balance after withdrawal: 5067.75

 * Error: Insufficient funds.
 * Account: 93757
 * Requested: $800.00
 * Available: $759.32

 * 72354	Bill Gates	$103,526.75
 * 69713	Barack Obama	$5,245.12
 * 93757	Hillary Clinton	$785.90

 * After transferring $50,000, Hillary Clinton's balance is now $50,785.90
 * and Bill Gates' balance is now $53,526.75.

 * You cannot withdraw $100,000 from Bill Gates' account 
 * since his balance is only $53,526.75.
 */
public class BankingTesterAfterExercise1
{
    private static NumberFormat fmt = NumberFormat.getCurrencyInstance();

    //-----------------------------------------------------------------
    //  Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main ()
    {

        Account acct1 = new Account ("Bill Gates", 72354, 100000);
        Account acct2 = new Account ("Barack Obama", 69713, 5000);
        Account acct3 = new Account ("Hillary Clinton", 93757, 759.32);

        acct1.deposit (25.85);

        double obamaBalance = acct2.deposit (500.00);
        System.out.println ("Obama balance after deposit: " +
            obamaBalance);

        System.out.println ("Obama balance after withdrawal: " + 
            acct2.withdraw (430.75, 1.50));

        acct3.withdraw (800.00, 0.0);  // exceeds balance

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println ();
        System.out.println (acct1);
        System.out.println (acct2);
        System.out.println (acct3);
        System.out.println ();

        acct3.transfer(acct1, 50000);
        // if(acct3.transfer(acct1, 50000))
        // System.out.println("After transferring $50,000, Hillary Clinton's balance is now "+fmt.format(acct3.getBalance())
        // +"\nand Bill Gates' balance is now "+fmt.format(acct1.getBalance())+".\n");
        // else System.out.println("You cannot withdraw $50,000 from Bill Gates' account \nsince his balance is"
        // +" only "+fmt.format(acct1.getBalance())+".\n");
        System.out.println();
        acct2.transfer(acct1, 100000);
        // if(acct2.transfer(acct1, 100000))
        // System.out.println("After transferring $100,000, Barack Obama's balance is now "+acct2.getBalance()
        // +"\nand Bill Gates' balance is now "+fmt.format(acct1.getBalance())+".\n");
        // else System.out.println("You cannot withdraw $100,000 from Bill Gates' account \nsince his balance is"
        // +" only "+fmt.format(acct1.getBalance())+".\n");
    }
}
