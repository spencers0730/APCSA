import java.util.*;

public class project5{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println();
            String str = scan.nextLine();
            for(int i = 0; i < str.length(); i++){
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}