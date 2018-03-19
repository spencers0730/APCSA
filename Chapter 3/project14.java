import java.util.*;

public class project14{
    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSORS = 2;

    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            int compChoice = (int)(Math.random() * 3);
            System.out.println("Enter Choice:");
            int userChoice = Character.toLowerCase(scan.nextLine().charAt(0));
            switch(userChoice){
                case 'r':
                userChoice = ROCK;
                break;
                case 'p':
                userChoice = PAPER;
                break;
                case 's':
                userChoice = SCISSORS;
                break;
            }
            String compName = name(compChoice);
            String userName = name(userChoice);
            String out = "The winner is ";
            switch(winner(compChoice, userChoice)){
                case 1:
                out += "me. ";
                break;
                case 2:
                out += "you. ";
                break;
                case 0:
                out += "no one. ";
            }
            out += "I had " + compName + " and you had " + userName + ".";
            System.out.println(out);
        }
    }

    static String name(int choice){
        switch(choice){
            case ROCK:
            return "rock";
            case PAPER:
            return "paper";
            case SCISSORS:
            return "scissors";
        }
        return null;
    }
    
    static int winner(int p1, int p2){
        if((p1 + 2) % 3 == p2 || p1 - 1 == p2) return 1;
        if((p2 + 2) % 3 == p1 || p2 - 1 == p1) return 2;
        return 0;
    }
}