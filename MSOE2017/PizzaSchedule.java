import java.util.*;
public class PizzaSchedule{
    public static void main(){
        Scanner scan = new Scanner(System.in);

        int[] schedule = new int[365];
        int[] tolerance;
        boolean possible = true;

        System.out.println("num kids");
        tolerance = new int[scan.nextInt()];
        for(int i = 0; i < tolerance.length; i++){
            System.out.println("kid #" + (i + 1) + " tolerance");
            tolerance[i] = scan.nextInt();
        }
        sortArr(tolerance);
        for(int i = 0; i < tolerance.length && possible; i++){
            int lastDay = 0;
            for(int day = tolerance[i] - 1; day < schedule.length && possible; day += tolerance[i]){
                boolean isSpace = true;
                while(schedule[day] != 0 && isSpace){
                    day--;
                    isSpace = day > lastDay;
                }
                if(isSpace){ 
                    schedule[day] = tolerance[i];
                    lastDay = day;
                } else 
                    possible = false;
            }
        }

        if(possible){
            printArr(schedule);
        }
        else 
            System.out.println("not possible");
    }

    public static void sortArr(int[] a){
        Arrays.sort(a);
    }

    public static void printArr(int[] a){
        String out = "[";
        for(int i = 0; i < a.length; i++) 
            out += (a[i]) + ((i == a.length - 1)? "]" : ", ");
        System.out.println(out);
    }
}