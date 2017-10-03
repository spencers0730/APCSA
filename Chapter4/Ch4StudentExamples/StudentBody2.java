//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************
public class StudentBody2{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main(){
      Address school = new Address("800 Lancaster Ave.","Villanova","PA",19085);
      Address jHome = new Address("21 Jump Street","Lynchburg","VA",24551);
      Student john = new Student("John","Gomez",jHome,school);
      
      Address mHome = new Address("123 Main Street","Euclid","OH",44132);
      Student marsha = new Student("Marsha","Jones",mHome,school,95,85);
      
      
      /* Assign three random test scores to John, except John never fails a test!
       * Print each test score.
       * Print John's average test score accurate to two decimal places.
       
       * Set a third test score for Marsha at 75.
       * Marsha is unhappy with this score, so her teacher lets her retake the test
       *    and keeps the higher of the two attempts. Marsha's new score is a random
       *    integer between 70 and 80. Print the new score, then set the higher of
       *    the two scores.
       * Print Marsha's new average accurate to two decimal places.
       */
      
      
      for (int i=1;i<4;i++){
          john.setTestScore(i,(int)(Math.random()*40+60));
          System.out.println(john.getTestScore(i));
      }
      System.out.println("John's average score is "+Math.round(john.average()*100)/100.0+"%");
      
      System.out.println();
      
      marsha.setTestScore(3,75);
      int NewScore = (int)(Math.random()*10+70);
      System.out.println("New score = "+NewScore);
      if (NewScore>marsha.getTestScore(3)) marsha.setTestScore(3,NewScore);
      System.out.println("Marsha's average score is "+Math.round(marsha.average()*100)/100.0+"%");
      
      
      
   }
}
