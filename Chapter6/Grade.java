public class Grade{
    String grade;
    int cutoff;
    public Grade(String g, int c){
        this.grade = g;
        this.cutoff = c;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public int getCutoff(){
        return this.cutoff;
    }
    
    public String toString(){
        return grade + "\t" + cutoff;
    }
}   