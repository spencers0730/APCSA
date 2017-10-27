import java.util.*;
public class Fractions{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            int numFracts = 0;            
            boolean run = true;
            while(run){
                System.out.println("\nHow many fractions?");
                numFracts = scan.nextInt();
                if(numFracts < 1){
                    System.out.println("You need at least 1 fraction!");
                }
                else run = false;
            }

            boolean mixedFrac = false;
            run = true;
            while(run){
                System.out.println("Do you want mixed fractions?");
                String input = scan.next();
                if(input.length() == 0){
                    System.out.println("That is not a valid answer!");
                } else {
                    run = false;
                    switch(input.toLowerCase().charAt(0)){
                        case 'y':
                        mixedFrac = true;
                        break;
                        case 'n':
                        mixedFrac = false;
                        break;

                        default:
                        System.out.println("That is not a valid answer!");
                        run = true;
                    }
                }
            }

            Rational[] fracts = new Rational[numFracts];
            for(int i = 0; i < fracts.length; i++){
                System.out.println("Numerator #" + (i + 1) + ":");
                int numer = scan.nextInt();
                int denom = 0;
                run = true;
                while(run){
                    System.out.println("Denomenator #" + (i + 1) + ":");
                    denom = scan.nextInt();
                    if(denom == 0){
                        System.out.println("That is not a valid denominator!");
                    }
                    else run = false;
                }
                fracts[i] = new Rational(numer, denom);
            }

            String answer = "";
            Rational partial = fracts[0];
            boolean usedEquals = false;
            run = true;
            while(run){
                System.out.println("What do you want to do?"); 
                answer = scan.next().substring(0, 1);
                run = false;
                switch(answer){
                    case "a":
                    case "+":
                    answer = " added equal ";
                    for(int i = 1; i < fracts.length; i++){
                        partial = partial.add(fracts[i]); 
                    }
                    break;

                    case "s":
                    case "-":
                    answer = " subtracted equal ";
                    for(int i = 1; i < fracts.length; i++){
                        partial = partial.subtract(fracts[i]); 
                    }
                    break;

                    case "m":
                    case "x":
                    case "*":
                    answer = " multiplied equal ";
                    for(int i = 1; i < fracts.length; i++){
                        partial = partial.multiply(fracts[i]); 
                    }
                    break;

                    case "d":
                    case "/":
                    answer = " divided equal ";
                    for(int i = 1; i < fracts.length; i++){
                        partial = partial.divide(fracts[i]); 
                    }
                    break;

                    case "r":
                    case "i":
                    if(fracts.length == 1){
                        answer = " inversed equals ";
                        partial = partial.reciprocal();
                    }else {
                        run = true;
                        System.out.println("That is not a valid operation!");
                    }
                    break;

                    case "e":
                    usedEquals = true;
                    boolean equals = true;
                    for(int i = 1; i < fracts.length && equals; i++){
                        equals = partial.equals(fracts[i]);
                    }
                    if(equals) answer = " are all equal";
                    else answer = " are not all equal";
                    break;

                    default:
                    run = true;
                    System.out.println("That is not a valid operation!");
                }
            }

            for(int i = 0; i < fracts.length; i++){
                String print = fracts[i].toString();
                if(i + 2 == fracts.length){
                    if(fracts.length == 2){
                        print += " and ";
                    } else {
                        print += ", and "; 
                    }
                } else if(i + 1 != fracts.length){
                    print += ", ";
                }
                System.out.print(print);
            }
            
            String fraction = partial.toString();
            if(mixedFrac){
                int n = partial.mixedFrac();
                fraction = (n == 0) ? partial.toString() : 
                n + " " + partial.toString();
            }
            answer += (usedEquals) ? "." : fraction + ".";
            System.out.println(answer);
        }
    }
}