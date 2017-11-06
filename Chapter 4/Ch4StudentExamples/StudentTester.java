
/**
 * Here is the output you should get:
 * 
 * Original Data: 

John Gomez
Home Address:
21 Jump Street
Lynchburg, VA  24551
School Address:
800 Lancaster Ave.
Villanova, PA  19085
Test Scores 0 0 0
Average of test scores: 0.0

Marsha Jones
Home Address:
123 Main Street
Euclid, OH  44132
School Address:
800 Lancaster Ave.
Villanova, PA  19085
Test Scores 95 85 0
Average of test scores: 60.0

Vincent Ruckert
Home Address:
456 Juniper Street
Cedarburg, WI  53012
School Address:
800 Lancaster Ave.
Villanova, PA  19085
Test Scores 100 98 96
Average of test scores: 98.0

Marsha's second test was a 85.

With John's new scores added in, here is his updated information: 
John Gomez
Home Address:
21 Jump Street
Lynchburg, VA  24551
School Address:
800 Lancaster Ave.
Villanova, PA  19085
Test Scores 75 97 0
Average of test scores: 57.333333333333336

 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTester
{
   public static void main(){
      Address school = new Address("800 Lancaster Ave.","Villanova","PA",19085);
      Address jHome = new Address("21 Jump Street","Lynchburg","VA",24551);
      Student john = new Student("John","Gomez",jHome,school);
      
      Address mHome = new Address("123 Main Street","Euclid","OH",44132);
      Student marsha = new Student("Marsha","Jones",mHome,school,95,85);
      
      Address vHome = new Address("456 Juniper Street","Cedarburg","WI",53012);
      Student vincent = new Student("Vincent","Ruckert",vHome,school,100,98,96);
      
      System.out.println("Original Data: \n\n"+john+"\n\n"+marsha+"\n\n"+vincent);
      
      john.setTestScore(1,75);
      john.setTestScore(2,97);
      
      System.out.println("\nMarsha's second test was a "+marsha.getTestScore(2)+".");
      System.out.println("\nWith John's new scores added in, here is his updated"+
      " information: \n"+john);
}
}
