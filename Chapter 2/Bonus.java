import java.util.*;

public class Bonus{
    static final int MAX_TRIES = 8;
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("Do you want to play?");
            run = scan.next().toLowerCase().charAt(0) == 'y';
            if(run){
                int num = (int)(Math.random() * 100 + 1);
                boolean right = false;
                for(int left = MAX_TRIES; left > 0 && !right; left--){
                    System.out.println("Guess the number (1 - 100):");
                    int guess = scan.nextInt();
                    right = guess == num;
                    if(right) System.out.println("Correct!");
                    else{ 
                        if(guess > num){
                            System.out.println("Too high!");
                        } else {
                            System.out.println("Too low!");
                        }
                        
                        if(left > 1){
                            System.out.println("Try Again\n" + 
                            "You still have " + (left - 1) + " tries.");
                        } else {
                            System.out.println("You lose :(" + 
                            "The correct number was " + num);
                        }
                    }
                }
            }
        }
    }
}