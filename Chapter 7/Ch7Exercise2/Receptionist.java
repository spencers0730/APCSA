public class Receptionist extends Administrator {
    private boolean answering;
    
    private static final String work = "answering";

    public Receptionist(String name, int number, String department, boolean answering){
        super(name, number, department);
        setIsAnswering(answering);
    }
    
    public void setIsAnswering(boolean answering){
        this.answering = answering;
    }
    
    public boolean getIsAnswering(){
        return answering;
    }
    
    public String toString(){
        return super.toString() + "\t" + super.working(Receptionist.work, answering);
    }
    
    public void answer(){
        System.out.println(super.working(Receptionist.work, answering));
    }
}