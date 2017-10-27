//********************************************************************
//  Rational.java       Author: Lewis/Loftus/Cocking
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************

public class Rational implements Lockable
{
   private int numerator, denominator;
   private int key;
   private boolean isItLocked;

      public Rational (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
         numer = numer * -1;
         denom = denom * -1;
      }
      key = 0;
      isItLocked = false;
      
      numerator = numer;
      denominator = denom;

      reduce();
   }

   public void setKey (int isaac)
   {
       key = isaac;
   }
   
   public void lock (int emma)
   {
       if (emma == key)
       isItLocked = true;
   }
   
   public void unlock (int david)
   {
       if (david == key)
       isItLocked = false;
   }
   
   public boolean locked ()
   {
       return isItLocked;
   }
   
      public int getNumerator ()
   {
      return numerator;
   }

      public int getDenominator ()
   {
      return denominator;
   }

      public Rational reciprocal ()
   {
      return new Rational (denominator, numerator);
   }

      public Rational add (Rational op2)
   {
      if (isItLocked)
      {
          return new Rational (0,0);
      }
      else
      {
          int commonDenominator = denominator * op2.getDenominator();
          int numerator1 = numerator * op2.getDenominator();
          int numerator2 = op2.getNumerator() * denominator;
          int sum = numerator1 + numerator2;
          return new Rational (sum, commonDenominator);
      }
   }

      public Rational subtract (Rational op2)
   {
      if (isItLocked)
      {
          return new Rational (0,0);
      }
      else
      {
          int commonDenominator = denominator * op2.getDenominator();
          int numerator1 = numerator * op2.getDenominator();
          int numerator2 = op2.getNumerator() * denominator;
          int difference = numerator1 - numerator2;

          return new Rational (difference, commonDenominator);
      }
   }

      public Rational multiply (Rational op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();

      return new Rational (numer, denom);
   }

     public Rational divide (Rational op2)
   {
      return multiply (op2.reciprocal());
   }

      public boolean equals (Rational op2)
   {
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }

     public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
    
      return result;
   }

     private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

     private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}
