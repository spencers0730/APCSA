public class Nurse extends HospitalEmployee{
    private int numPatients;

    public Nurse(String name, int number, int numPatients){
        super(name, number);
        this.numPatients = numPatients;
    }

    public void setNumPatients(int numPatients){
        this.numPatients = numPatients;
    }

    public int getNumPatients(){
        return numPatients;
    }
    
    public String toString(){
        return super.toString() + "\tNumber of Patients: " + numPatients;
    }

    public void assist(){
        System.out.println(super.getName() + " is a nurse with " + numPatients  + " patients.");
    }
}