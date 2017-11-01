import java.util.*;

public class project10{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            int number = (int)(Math.random() * 100 + 1);
            int guess = 0;
            System.out.println("Guess the number (1 - 100):");
            while(number != guess && run){
                guess = scan.nextInt();
                run = !(guess < 1 || guess > 100);
                if(run){
                    String output = "That number is ";
                    if(guess == number){
                        output += "correct!";
                    }
                    else if(guess < number){
                        output += "too low.";
                    } else{
                        output += "too high.";   
                    }
                    System.out.println(output);
                }
            }
            System.out.println("You want to play again?");
            run = Character.toLowerCase(scan.next().charAt(0)) == 'y';
        }
    }
}

