import java.util.*;

public class project13{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            String in = scan.nextLine();
            String out = "";
            for(int i = 0; i < in.length(); i++){
                out += ("AEIOUaeiou".indexOf(in.charAt(i)) != -1) ? 
                    Character.toUpperCase(in.charAt(i)) : in.charAt(i);
            }
            System.out.println(out);
        }
    }
}