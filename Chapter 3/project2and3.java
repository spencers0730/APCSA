import java.util.*;

public class project2and3{

    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        boolean run = true;
        while(run && scan.hasNext()){
            int year = scan.nextInt();
            run = year != 0;
            if(run){
                if(year >= 1582){
                    boolean isLeap = year % 4 == 0;
                    if(year % 100 == 0)
                        isLeap = year % 400 == 0;
                    System.out.println(isLeap);
                } else {
                    System.out.println("This year is not applicable!");
                }
            }
        }
    }
}