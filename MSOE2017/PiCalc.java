import java.util.*;

public class PiCalc{
    public static void main(String[] s){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to approximate Pi:");
        int max = scan.nextInt();
        double component = 0;
        for(int i = 1; i <= max; i++){
            component += 1.0/(i * i); //Math.pow(i, -2);
            double pi = Math.sqrt(6 * component);
            System.out.println("Pi is approximately: " + pi + "\t at the iteration of " + i);
        }
        if(max < 1) System.out.println(max + "is not a compatible maximum number.");
    }
}
