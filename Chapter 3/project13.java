import java.util.*;

public class project13{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        String[] vowelsStr = new String[]{"As", "Es", "Is", "Os", "Us"};
        while(true){
            String in = scan.nextLine();
            int[] vowels = new int[5];
            for(int i = 0; i < in.length(); i++){
                int index = -1;
                switch(Character.toLowerCase(in.charAt(i))){
                    case 'a':
                    index = 0;
                    break;
                    case 'e':
                    index = 1;
                    break;
                    case 'i':
                    index = 2;
                    break;
                    case 'o':
                    index = 3;
                    break;
                    case 'u':
                    index = 4;
                }
                if(index != -1){
                    vowels[index]++;
                }
            }
            String out = "There are "; 
            for(int i = 0; i < vowels.length; i++){
                out += vowels[i] + " " + vowelsStr[i] + ((i == vowels.length - 1) ? "." : ", ");
            }
            System.out.println(out);
        }
    }
}