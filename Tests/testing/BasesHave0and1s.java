package testing;

import java.util.*;

public class BasesHave0and1s{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int[] bases = new int[]{2, 3, 4, 5};
        System.out.println();
        for(int n = 10; n < Integer.MAX_VALUE - 1; n++){
                   boolean run = true;
            for(int b = 0; b < bases.length && run; b++){
                String c = Integer.toString(n, bases[b]);
                for(int i = 0; i < c.length() && run; i++){
                    run = !(c.charAt(i) == '0' || c.charAt(i) == '1');
                }
            }
            if(!run) System.out.println(n);
        }

    }
}