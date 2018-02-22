public class Surgeon extends Doctor{
    private boolean operating;
    
    private static final String work = "operating";

    public Surgeon(String name, int number, String speciality, boolean operating){
        super(name, number, speciality);
        this.operating = operating;
    }

    public void setOperating(boolean operating){
        this.operating = operating;
    }

    public boolean getOperating(){
        return operating;
    }

    public String toString(){
        return super.toString() + "\t" + super.working(Surgeon.work, operating);
    }

    public void operate(){
        System.out.println(super.working(Surgeon.work, operating));
    }
}