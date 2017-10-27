
/**
 * Write a description of class RationalTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RationalTester
{
   public static void main()
   {
      Rational r1=new Rational(4,5);
      Rational r2=new Rational(6,7);
      r1.setKey(24863157);
      r1.lock(24863157);
      System.out.println(r1.locked());
      
      System.out.println(r1+" added to "+r2+" equals "+r1.add(r2));
      r1.unlock(24863157);
      System.out.println(r1.locked());
      System.out.println(r1+" minus "+r2+" equals "+r1.subtract(r2));
      System.out.println(r1+" multiplied by "+r2+" equals "+r1.multiply(r2));
      System.out.println(r1+" divided by "+r2+" equals "+r1.divide(r2));
    }
}
