package Ch4BankExamples;

//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking
{
    //-----------------------------------------------------------------
    //  Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main ()
    {
        Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
        Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
        Account acct4 = new Account ("Mike Cullen", 12345);

        acct1.deposit (25.85);

        double gomezBalance = acct2.deposit (500.00);
        System.out.println ("Gomez balance after deposit: " +
            gomezBalance);

        System.out.println ("Gomez balance after withdrawal: " + 
            acct2.withdraw (430.75, 1.50));

        acct3.withdraw (800.00, 0.0);  // exceeds balance

        acct3.transfer(acct2, 20);
        acct1.transfer(acct3, 4000000);

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
