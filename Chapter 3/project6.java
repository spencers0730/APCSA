import java.util.*;

public class project6{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println();
            int number = scan.nextInt();
            System.out.println();            
            int odd = 0;
            int even = 0;
            int zero = 0;

            int length = (int)Math.log10(number) + 1;

            for(int i = 0; i < length; i++){
                int digit = number % 10;
                number /= 10;
                if(digit % 2 == 0) even++;
                else odd++;
                if(digit == 0) zero++;
            }
            System.out.println("Even " + even + " Odd " + odd + " Zero "+ zero);
        }
    }

}
