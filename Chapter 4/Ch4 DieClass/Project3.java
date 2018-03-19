import java.util.*;

public class Project3{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick number of sides:");
        int sides = scan.nextInt();
        Die d = new Die(sides);
        System.out.println(d.roll());
    }
}