public class HospitalEmployee{
    private String name;
    private int number;

    public HospitalEmployee(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return name + "\t" + number;
    }

    public void work(){
        System.out.println(name + " works for the hospital.");
    }

    public String working(String work, boolean is){
        return name + " is " + ((is)? "" : "not ") + work +".";
    }
}