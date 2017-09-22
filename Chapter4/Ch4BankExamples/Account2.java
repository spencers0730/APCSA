import java.text.NumberFormat;

public class Account2
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();
   private final double RATE = 0.035;  // interest rate of 3.5%
   private int acctNumber;
   private double balance;
   private String name;

   public Account2 (String owner, int account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }
    
   public double deposit (double amount)
   {
      if (amount < 0)  // deposit value is negative
      {
         System.out.println ();
         System.out.println ("Error: Deposit amount is invalid.");
         System.out.println (acctNumber + "  " + fmt.format(amount));
      }
      else
         balance = balance + amount;
      return balance;
   }
  
   public double getBalance ()
   {
      return balance;
   }
   
   public String toString ()
   {
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }
}

