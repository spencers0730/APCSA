public class Ex7orGradeRange{    
    public static void main(){
        Grade[] grades;
        grades = new Grade[12];
        
        String[] gradeStr = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", 
                "D+", "D", "D-", "F"};
        int[] gradeCutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60,0 };
        
        for(int i = 0; i < grades.length; i++){
            grades[i] = new Grade(gradeStr[i], gradeCutoff[i]);
            System.out.println(grades[i]);
        }
    }
}