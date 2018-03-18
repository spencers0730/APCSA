import java.util.Scanner;
/**
 * Write a description of class FactorialDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactorialDemo
{
    public static void main()
    {
        System.out.println("Which factorial would you like to calculate?");
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int answer=factorial(n);
        System.out.println(n+" factorial equals "+answer);
    }

    public static int factorial(int n)
    {
        if(n <= 1)
            return 1;
        return n * factorial(n-1);
    }
}
