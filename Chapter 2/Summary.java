import java.util.*;
public class Summary{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("Enter a word:");
            String word = scan.nextLine();
            if(word.indexOf("quit") != -1) run = false;
            if(run){
                int alpha = isAlpha(word);
                String out = word + " is " +
                    ((alpha == -1) ? "alphabetical" : "not alphabetical at "
                        + alpha + " to " + (alpha + 1)) + ".";
                System.out.println(out);
            }
        }
    }

    public static int isAlpha(String str){
        // boolean is = true;
        // int out = -1;
        // for(int i = 0; i < str.length() - 1 && is; i++){
        // is = str.substring(i, i+1).compareTo(str.substring(i+1, i+2)) <= 0;
        // if(!is)
        // out = i;
        // }
        // return out;

        for(int i = 0; i < str.length() - 1; i++){
            boolean is = str.substring(i, i+1).compareTo(str.substring(i+1, i+2)) <= 0;
            if(!is)
                return i + 1;
        }
        return -1;
    }
}