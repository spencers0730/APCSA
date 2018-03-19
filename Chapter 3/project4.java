import java.util.*;

public class project4{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("\nEnter a number >= 2:");
            int end = scan.nextInt();
            if(end >= 2){
                int sum = 0;
                for(int i = 2; i <= end; i += 2){
                    sum += i;
                }
                System.out.println(sum);
            } else {
                System.out.println("That value is not >= 2!\nTry Again!");
            }
        }
    }
}