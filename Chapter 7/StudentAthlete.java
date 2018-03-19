//********************************************************************
//  StudentAthlete.java       Author: Lewis/Loftus/Cocking
//
//  Represents a student athlete who plays a sports team for the school.
//  Used to demonstrate inheritance.
//********************************************************************

public class StudentAthlete extends Student
{
   private String sport;

   public StudentAthlete (String studentName, int courses,
                       String sportName)
   {
      super (studentName, courses);

      sport = sportName;
   }

   public String toString()
   {
      String result = super.toString();

      result += "\nSport: " + sport;

      return result;
   }
}
