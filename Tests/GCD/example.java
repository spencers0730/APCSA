import java.util.*;

public class example{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Tester tester = new Tester("C:\\Users\\Spencer\\Documents\\BlueJ\\GCD\\output\\");
        boolean run = true;
        while(run){
            System.out.println("Enter start:");
            int start = scan.nextInt();
            System.out.println("Enter end:");
            int end = scan.nextInt();
            run = start < end;
            if(run){ 
                try {
                    tester.run(start, end);
                } catch(Exception e){
                    System.err.println(e.getMessage()); 
                }
            }
        }
    }
}