public class StudentExchange extends Student
{
    public String countryOfOrigin;
    
    public StudentExchange(String name, int courses, String country)
    {
        super(name, courses);
        countryOfOrigin = country;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Country of Origin: " + countryOfOrigin; 
    }
}
