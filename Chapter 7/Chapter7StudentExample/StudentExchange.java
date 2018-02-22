
/**
 * Write a description of class StudentExchange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentExchange extends Student
{
    public String countryOfOrigin;
    
    public StudentExchange(String name, int courses, String country)
    {
        super(name, courses);
        countryOfOrigin = country;
    }
}
