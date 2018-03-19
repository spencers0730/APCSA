//********************************************************************
//  RationalNumbers.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************

public class RationalDriver
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Rational2 r1 = new Rational2 (6, 8);
      Rational2 r2 = new Rational2 (1, 3);
      Rational2 r3, r4, r5, r6, r7;
      Rational2 r8 = new Rational2 (750001, 1000000);

      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);
      System.out.println ("Third rational number: " + r8+"\n\n");

      if (r1.compareTo(r2)==0)
         System.out.println (r1+" and "+r2 +" are equal.");
      else if (r1.compareTo(r2)<0)
         System.out.println (r1+" is less than "+r2);
         else System.out.println(r1+" is greater than "+r2);
      
      if (r1.compareTo(r8)==0)
         System.out.println (r1+" and "+r8 +" are equal.");
      else if (r1.compareTo(r8)<0)
         System.out.println (r1+" is less than "+r8);
         else System.out.println(r1+" is greater than "+r8);
       
      if (r2.compareTo(r1)==0)
         System.out.println (r2+" and "+r1 +" are equal.");
      else if (r2.compareTo(r1)<0)
         System.out.println (r2+" is less than "+r1);
         else System.out.println(r2+" is greater than "+r1);
      
        r3 = r1.reciprocal();
      System.out.println ("\n\nThe reciprocal of r1 is: " + r3);

      r4 = r1.add(r2);
      r5 = r1.subtract(r2);
      r6 = r1.multiply(r2);
      r7 = r1.divide(r2);
      
      System.out.println ("r1 + r2: " + r4);
      System.out.println ("r1 - r2: " + r5);
      System.out.println ("r1 * r2: " + r6);
      System.out.println ("r1 / r2: " + r7);
      
      
   }
}
