package changeBase;

import java.util.*;
public class changeBase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
       
        while(run)
        {
            System.out.println("Enter number, start base, and end base:");
            String num = scanner.next();
            int startBase = scanner.nextInt();
            int endBase = scanner.nextInt();
            if(startBase <= 0)
            {
                run = false;
                break;
            }
            System.out.println();
        }
        System.out.println("Thanks for playing!");
        
    }
}