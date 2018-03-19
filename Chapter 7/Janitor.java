public class Janitor extends Administrator{
    private boolean sweeping;

    private static final String work = "sweeping";
    
    public Janitor(String name, int number, String department, boolean sweeping){
        super(name, number, department);
        setIsSweeping(sweeping);
    }

    public void setIsSweeping(boolean sweeping){
        this.sweeping = sweeping;
    }

    public boolean getIsSweeping(){
        return sweeping;
    }

    public String toString(){
        return super.toString() + "\t" + super.working(Janitor.work, sweeping);
    }

    public void sweep(){
        System.out.println(super.working(Janitor.work, sweeping));
    }
}