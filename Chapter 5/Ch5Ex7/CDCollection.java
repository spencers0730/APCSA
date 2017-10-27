
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDCollection
{
    
    private String cdName;
    private String artistName;
    private double cost;
    private static int count;

    public CDCollection(String n1, String n2, double c1)
    {
        cdName=n1;
        artistName=n2;
        cost=c1;
        count++;
    }

    public String getArtist(CDCollection c1)
    {
        return c1.artistName;
    }
    
    public static int getCount()
    {
        return count;
    }
}
