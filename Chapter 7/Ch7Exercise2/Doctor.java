package Ch7Exercise2;

public class Doctor extends HospitalEmployee{
    String speciality;
    
    public Doctor(String name, int number, String speciality){
        super(name, number);
        this.speciality = speciality;
    }
    
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
    
    public String getSpeciality(){
        return speciality;
    }
    
    public String toString(){
        return super.toString() + "\t" + speciality;
    }
    
    public void diagnose(){
        System.out.println(super.getName() + " is a(n) " + speciality + " doctor.");
    }
}