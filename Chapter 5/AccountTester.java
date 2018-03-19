//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class AccountTester
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      
      acct1.setKey(25);
      acct2.setKey(35);
      acct3.setKey(45);
      
      acct1.lock(25);
      acct2.lock(35);

      acct1.deposit (25.85);
      acct3.deposit (35);
      
      System.out.println("Reddy balance after deposit "+acct3.getBalance());
      acct2.unlock(35);
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
   }
}
