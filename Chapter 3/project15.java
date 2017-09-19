import java.util.*;

public class project15{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int credits = 10;
        while(run){
            System.out.println("Would you like to play?\nCost is 1 credit.");
            printCredits(credits);
            char ans = Character.toLowerCase(scan.nextLine().charAt(0));
            System.out.println();
            run = ans == 'y';
            if(run){
                credits = iterate(credits);
                String output = "";
                if(credits >= 100){
                    run = false;
                    output = "You won!!";
                }
                else if(credits <= 0){
                    run = false;
                    output = "You lose!";
                }
                else{
                   printCredits(credits);
                }
                System.out.println(output);
            }
        }
        System.out.println("Thanks so much!");
    }

    static int iterate(int credits){
        credits--;
        int nums = 3;
        int[] count = new int[10];
        int maxSame = 0;
        for(int i = 0; i < nums; i++){
            int num = (int)(Math.random() * count.length);
            count[num]++;

            System.out.print(num + " ");
            wait(1000);
        }
   
        for(int i = 0; i < count.length; i++){
            maxSame = Math.max(maxSame, count[i]);
        }

        String output = "\n\n";
        switch(maxSame){
            case 2:
            credits += 5;
            output += "You got two of the same.\n+5 Credits!";
            break;
            case 3:
            credits += 10;
            output += "You got all the same.\n+10 Credits!";
            break;
            default:
            output += "Oh no!\n0 Credits!";
        }
        wait(500);
        System.out.println(output);
        return credits;
    }

    static void printCredits(int credits){
        String plural = (credits == 1) ? "s" : "";
        System.out.println("You have " + credits + plural + " credits.");
    }

    static void wait(int millis){
        try {
            Thread.sleep(millis);
        } 
        catch(InterruptedException e)  {
            Thread.currentThread().interrupt();
        }
    }

}