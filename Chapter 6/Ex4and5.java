import java.util.*;

public class Ex4and5 {
    static final int perChar = 1;
    public static void main() {
        int[] nums = new int[10];
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while(run){
            System.out.println("Enter num " + 1 + " to " + 100);
            int index = (Math.max(1, Math.min(100, scan.nextInt())) - 1)/ 10;
            nums[index]++;
            System.out.println("again?");
            run = scan.next().charAt(0) == 'y';
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(((i+1) * 10 - 9)+ "-" + ((i+1) * 10) + "\t|\t" 
                + repeat(nums[i], "*"));
        
        }
    }
    
    public static String repeat(int n, String str){
        String ret = "";
        for(int i = 0; i < n / perChar; i++){
            ret += str;
        }
        return ret;
    }
}