import java.util.*;
public class PythagoreanTriple{
    public static void main(String[] s){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a leg value:");
        int legA = scan.nextInt();
        System.out.println("Enter another leg value:");
        int legB = scan.nextInt();
        System.out.println("Enter a hypotenuse:");
        int hypotenuse = scan.nextInt();
        boolean isTriple = (legA * legA) + (legB * legB) == (hypotenuse * hypotenuse) 
            && (legA > 0 && legB > 0 && hypotenuse > 0);
               System.out.println("This is " + ((isTriple) ? "" : "not ") + "a pythagorean triple.");
    }
}