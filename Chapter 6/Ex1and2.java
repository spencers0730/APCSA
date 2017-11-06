import java.util.*;

public class Ex1and2 {
    static final int minRange = -5;
    static final int maxRange = 5;
    public static void main() {
        int[] nums = new int[maxRange - minRange + 1];
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while(run){
            System.out.println("Enter num " + minRange + " to " + maxRange);
            int index = Math.max(minRange, Math.min(maxRange, scan.nextInt() - minRange));
            nums[index]++;
            System.out.println("again?");
            run = scan.next().charAt(0) == 'y';
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(i + minRange + " : " + nums[i]);
        }
    }
}