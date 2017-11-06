
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main()
    {
        int[][] practice={{7,12,17,22,15,19},{5,9,113,17,21,23},{5,-4,13,12,18,12},{5,6,7,8,9,10,12,4,6}};
        
        printarray(practice);
        
        System.out.println("The largest value in the array is "+ArrayOperationsorEx12Pt2.max(practice));
        System.out.println("\nThe sum of the elements in row 0 is "+ArrayOperationsorEx12Pt2.rowSum(practice, 0));
        System.out.println("\nThe sum of the elements in row 3 is "+ArrayOperationsorEx12Pt2.rowSum(practice, 3));
        System.out.println("\nThe sum of the elements in column 1 is "+ArrayOperationsorEx12Pt2.columnSum(practice, 1));
        int[] sums=ArrayOperationsorEx12Pt2.allRowSums(practice);
        System.out.println("\nThe sum of each row of the array is as follows ");
        for(int i=0;i<sums.length;i++)
        System.out.print(""+sums[i]+"\t");
        
    }
    
    public static void printarray(int[][] a){
        for(int i=0;i<a.length;i++)
            {for(int j=0;j<a[i].length;j++)
            {System.out.print(""+a[i][j]+"\t");}
            System.out.println("\n");}
        }
        
        
}
