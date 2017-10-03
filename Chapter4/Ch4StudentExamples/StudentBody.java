//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class StudentBody 
{
    //-----------------------------------------------------------------
    //  Creates some Address and Student objects and prints them.
    //-----------------------------------------------------------------
    public static void main ()
    {
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                "PA", 19085);

        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                "VA", 24551);
        Student john = new Student ("John", "Gomez", jHome, school);

        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                44132);
        Student marsha = new Student ("Marsha", "Jones", mHome, school);

        Address sHome = new Address("113 E Wall Ave", "San Jose", "CA", 14321);

        Student s1 = new Student("Spencer", "1", sHome, school, 45);
        Student s2 = new Student("Spencer", "2", sHome, school, 45, 67);
        Student s3 = new Student("Spencer", "3", sHome, school, 45 ,67 ,100);

        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
        System.out.println("\n" + s1 + "\n" + s2 + "\n" + s3);
        System.out.println("\n" + s1.average() + "\n" + s2.average() +
            "\n" + s3.average() + "\n");
    }
}
