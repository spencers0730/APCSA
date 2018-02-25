package Chapter7StudentExample;


public class StudentGrad extends Student
{
    public int gradYear;

    public StudentGrad(String name, int courses, int year)
    {
        super(name, courses);
        gradYear = year;
    }

    public String toString(){
        return super.toString() + "\n" + "Graduation Year: " + gradYear; 
    }
}
