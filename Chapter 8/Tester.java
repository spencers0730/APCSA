
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
        //Palindrome
        System.out.println("Palindrome:");
        String[] palindromes = {"Racecar", "Doom mood", "A man a plan a canal Panama"};
        for(String s : palindromes){
            System.out.println("\"" + s + "\"" + " is " + ((Palindrome.isPalindrome(s)) ? "" : "not ") + "a palindrome");
        }

        //Queens
        System.out.println("\n\nNon-Attacking Queens (2):");
        Queens.nonAttacking(2);
        
        System.out.println("\nNon-Attacking Queens (7):");
        Queens.nonAttacking(7);

        //Factorial
        System.out.println("\n\nFactorial: (0-9):");
        for(int i = 0; i < 10; i++){
            System.out.println(Factorial.factorial(i));
        }

        //Pascal's Triangle
        System.out.println("\n\nPascal's Triangle (0-19):");

        for(int i = 0; i < 20; i++){
            Pascal.row(i);
        }

        //Sorting Tester
        System.out.println("\n\nSorts:");

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
