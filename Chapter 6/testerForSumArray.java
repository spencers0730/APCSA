
/**
 * Write a description of class testerForSums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testerForSumArray
{
    public static void main()
    {
        double[] ray1={4.5, 5.6, 7.8};
        double sum=ShortAnswer5.sumArray(ray1);
        System.out.println("The correct sum should be 17.9");
        System.out.println("The sum from your written method is "+sum);
        if(sum==17.9)
             System.out.println("It appears your method works correctly\n\n");
        else
             System.out.println("Your method did not work for the first array\n\n");
        
        double[] ray2=new double[100];
        for(int j=0;j<100;j++)
        ray2[j]=j*1.1;
        sum=ShortAnswer5.sumArray(ray2);
        System.out.println("The correct sum should be 5445");
        System.out.println("The sum from your written method is "+sum);
        if(sum==5445)
             System.out.println("It appears your method works correctly\n\n");
        else
             System.out.println("Your method did not work for the first array\n\n");
        
}
}
