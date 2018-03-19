package Ch7Exercise2;

public class Administrator extends HospitalEmployee{
    private String department;

    public Administrator(String name, int number, String department){
        super(name, number);
        this.department = department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
    
    public String toString(){
        return super.toString() + "\t" + administrateString();
    }

    private String administrateString(){
        return "Works in the " + department + " department.";
    }
    
    public void administrate(){
        System.out.println(administrateString());
    }
    
    public String working(String work, boolean is){
        return super.working(work, is);
    }
}