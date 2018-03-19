import java.util.*;

public class project1
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println();    
            String str = scan.nextLine();

            int numberOfNumbers = 0;
            int[] typedNumbers = new int[0];
            double sum = 0;
            int numberIndex = 0;

            for(int time = 0; time < 2; time++){
                for(int i = 0; i < str.length(); i++){
                    boolean endOfNumSubString = true;
                    String numberToAdd = "";
                    boolean addedNumber = false;
                    while(endOfNumSubString && i < str.length()){
                        char current = str.charAt(i);
                        if(current >= '0' && current <= '9'){
                            i++;
                            if(time == 0 && !addedNumber){
                                numberOfNumbers++;
                            }
                            else {
                                numberToAdd += current;
                            }
                        }
                        else endOfNumSubString = false;
                        addedNumber = true;
                    }
                    if(time == 1 && numberToAdd != ""){
                        typedNumbers[numberIndex] = new Scanner(numberToAdd).nextInt();
                        numberIndex++;
                    }
                    if(time == 0){
                        typedNumbers = new int[numberOfNumbers];
                    }
                }
            }

            for(int i = 0; i < typedNumbers.length; i++){
                sum += typedNumbers[i];
            }

            if(typedNumbers.length != 0){
                sum /= typedNumbers.length;
                System.out.println(sum);
            }
            if(typedNumbers.length == 1 && typedNumbers[0] == 0){
                run = false;
            }
            
        }
    }
}