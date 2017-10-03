//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
    public static double[] getArray(double[] existing, int target){
        double[] array = new double[target];
        for(int i = 0; i < target; i++){
            if(i < existing.length)array[i] = existing[i];
            else array[i] = 0;
        }
        return array;
    }

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double[] testGrades;
    private double average;

    public static final int TOTAL_GRADES = 3;

    //-----------------------------------------------------------------
    //  Sets up this Student object with the specified initial values.
    //-----------------------------------------------------------------

    public Student (String first, String last, Address home,
    Address school)
    {
        this(first, last, home, school, 
            getArray(new double[]{}, TOTAL_GRADES));
    }

    public Student (String first, String last, Address home,
    Address school, double test1)
    {
        this(first, last, home, school, 
            getArray(new double[]{test1}, TOTAL_GRADES));
    }

    public Student (String first, String last, Address home,
    Address school, double test1, double test2)
    {
        this(first, last, home, school, 
            getArray(new double[]{test1, test2}, TOTAL_GRADES));
    }

    public Student (String first, String last, Address home,
    Address school, double test1, double test2, double test3)
    {
        this(first, last, home, school, 
            new double[]{test1, test2, test3});
    }

    public Student (String first, String last, Address home,
    Address school, double[] grades)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testGrades = getArray(grades, TOTAL_GRADES);
        computeAverage();
    }

    public void setTestScore(int testNumber, double score){
        if(testNumber > 0 && testNumber <= TOTAL_GRADES){
            testGrades[testNumber - 1] = score;
        }
        computeAverage();
    }

    public double getTestScore(int testNumber){
        if(testNumber > 0 && testNumber <= TOTAL_GRADES){
            return testGrades[testNumber - 1];
        }
        return -1;
    }

    private void computeAverage(){
        double sum = 0;
        int entered = 0;
        for(int i = 0; i < testGrades.length; i++){
            if(testGrades[i] != 0){
                entered++;
                sum += testGrades[i];
            }
        }
        if(entered != 0)
            average = sum / entered;
        else 
            average =  0;
    }
    
    public double average(){
        return average;
    }

    //-----------------------------------------------------------------
    //  Returns this Student object as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        for(int i = 0; i < testGrades.length; i++){
            result += "\nTest #" + (i + 1) + ": " + testGrades[i];
        }
        result += "\n" + average;
        return result;
    }
}
