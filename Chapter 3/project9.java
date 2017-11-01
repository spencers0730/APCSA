import java.util.*;

public class project9{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println();
            int n = scan.nextInt();
            for(int i = 100; i >= Math.max(1, 101 - n); i--){
                String bottle = " bottle";
                if(i != 1) bottle += "s";
                String beer = " of beer";
                String wall = " on the wall";
                String fall = "If one of those bottles should happen to fall";
                System.out.println(i + bottle + beer + wall);
                System.out.println(i + bottle + beer);
                System.out.println(fall);
                if(i - 1 != 1) bottle += "s";
                System.out.println((i - 1) + bottle + beer + wall);
            }
        }
    }
}