//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account implements Lockable
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private final double RATE = 0.035;  // interest rate of 3.5%

    private int acctNumber;
    private double balance;
    private String name;

    //   Add two more instance variables here.
    //  An int for the accountKey
    //  And a boolean to tell if the account is locked

    private int accountKey;
    private boolean isLocked;

    //-----------------------------------------------------------------
    //  Sets up the account by defining its owner, account number,
    //  and initial balance.
    //-----------------------------------------------------------------
    public Account (String owner, int account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
        accountKey = 0;
        isLocked = false;
        //also initialize the locked to false and accountKey to 0
    }

    //-----------------------------------------------------------------
    //  Validates the transaction, then deposits the specified amount
    //  into the account. Returns the new balance.
    //-----------------------------------------------------------------
    public double deposit (double amount)
    {
        if(isLocked) return balance;

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

    //-----------------------------------------------------------------
    //  Validates the transaction, then withdraws the specified amount
    //  from the account. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
        if(isLocked) return balance;

        amount += fee;

        if (amount < 0)  // withdraw value is negative
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
        }
        else
        if (amount > balance)  // withdraw value exceeds balance
        {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
        }
        else
            balance = balance - amount;

        return balance;
    }

    //-----------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest ()
    {
        if(isLocked) return balance;

        balance += (balance * RATE);
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance ()
    {
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the account number.
    //-----------------------------------------------------------------
    public int getAccountNumber ()
    {
        return acctNumber;
    }

    //-----------------------------------------------------------------
    //  Returns a one-line description of the account as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        if(isLocked) return "Account is Locked";

        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }

    public boolean transfer(Account from, double amount){
        if(!isLocked && !from.isLocked && from.getBalance() >= amount){
            from.withdraw(amount,  0);
            this.deposit(amount);
            return true;
        }

        return false;
    }

    public void setKey(int newKey){
        if(!isLocked) accountKey = newKey;
    }

    public void lock(int tryKey){
        if(tryKey == accountKey) isLocked = true;
    }

    public void unlock(int tryKey){
        if(tryKey == accountKey) isLocked = false;
    }

    public boolean locked(){
        return isLocked;
    }
}
