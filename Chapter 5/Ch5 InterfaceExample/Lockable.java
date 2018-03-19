
/**
 * Write a description of interface Lockable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Lockable
{
    public void setKey (int n1);
    public void lock (int n1);
    public void unlock (int n1);
    public boolean locked ();
}
