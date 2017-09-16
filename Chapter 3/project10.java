import java.util.*;

public class project10{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            int number = (int)(Math.random() * 100 + 1);
            int guess = 0;
            while(number != guess && run){
                System.out.println("Guess the number (1 - 100):");
                guess = scan.nextInt();
                run = guess != 0;
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
            run = Character.toLowerCase(scan.nextLine().charAt(0)) == 'y';
        }
    }
}

