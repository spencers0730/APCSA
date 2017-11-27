import java.util.*;
/**
 * Write a description of class psi1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class psi1
{
    public static void main(String[] s)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer");
        int i=scan.nextInt();
        if(i>0){
            ArrayList<Integer> factors = findFactors(i);
            int product=i;
            for(int k : factors)
                product*=k+1;
            for(int k : factors)
                product/=k;
            System.out.println(product);
        }
    }

    public static ArrayList<Integer> findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / 2 + 2; i++) 
            if (n % i == 0) {
                boolean ok = true;
                for(int j = 0; j < factors.size() && ok; j++)
                    ok = i % factors.get(j) != 0;
                if(ok)
                    factors.add(i);
            }
        return factors;
    }
}
