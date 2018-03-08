
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main()
    {
        int[] ary1 = {45,76,12, 45, 99};
        int[] ary2 = {34, 67, -12, 0, 0, 45, 98};
        int[] ary3 = {34, 45, 56, 67, 78, 89};
        
        Sorts.selectionSort(ary1);
        Sorts.insertionSort(ary2);
        Sorts.mergeSort(ary3);
        
        for(int i=0;i<ary1.length;i++)
        System.out.print(ary1[i]+"\t");
        System.out.println();
        
        for(int i=0;i<ary2.length;i++)
        System.out.print(ary2[i]+"\t");
        System.out.println();
        
        for(int i=0;i<ary3.length;i++)
        System.out.print(ary3[i]+"\t");
        System.out.println();
    }
}
