
/**
 * Write a description of class testerForSwitchThem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testerForSwitchThem
{
    public static void main()
    {
        int[] ray1={5, 6, 7, 9};
        int[] ray2={7, 1, 2, 4};
        int[] ray3={4,5,6};

        System.out.println("Array 1 contains");
        for(int i=0;i<ray1.length;i++){
            System.out.print(ray1[i]+"\t");
        }
        System.out.println();

        System.out.println("Array 2 contains");
        for(int i=0;i<ray2.length;i++){
            System.out.print(ray2[i]+"\t");
        }
        System.out.println("\n\n");

        ShortAnswer6.switchThem(ray1,ray2);

        System.out.println("After calling the switchThem method, Array 1 now contains");
        for(int i=0;i<ray1.length;i++){
            System.out.print(ray1[i]+"\t");
        }
        System.out.println();

        System.out.println("After calling the switchThem method, Array 2 now contains");
        for(int i=0;i<ray2.length;i++){
            System.out.print(ray2[i]+"\t");
        }
        System.out.println("\n\n\n");

        System.out.println("Array 1 contains");
        for(int i=0;i<ray1.length;i++){
            System.out.print(ray1[i]+"\t");
        }
        System.out.println();

        System.out.println("Array 3 contains");
        for(int i=0;i<ray3.length;i++){
            System.out.print(ray3[i]+"\t");
        }
        System.out.println("\n\n");

        ShortAnswer6.switchThem(ray1,ray3);
    }
}
