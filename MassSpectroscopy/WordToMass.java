import java.util.*;
import java.io.*;

public class WordToMass{
    static final int MAX_LETTERS = 26;
    static final String FILEPATH = "MASSES.txt";
    static int[] MASSES;
    public static void main() throws IOException{
        Scanner scan = new Scanner(System.in);
        getMasses();

        while(true){
            boolean tryAgain = false;
            String word;
            do{
                if(tryAgain)
                    System.out.println("Sorry, try again:\n");
                System.out.println("\nEnter a word to be massified:\n");
                word = scan.next().toUpperCase();
                for(int i = 0; i < word.length() && !tryAgain; i++){
                    char c = word.charAt(i);
                    tryAgain = !(c >= 'A' && c <= 'Z');
                }
            } while(tryAgain);

            if(word.length() == 0) break;
            int n = word.length();
            n = (n) * (n + 1) / 2;
            int spaces = (int)Math.ceil(word.length() / 8.0);

            String[] subs = new String[n];
            int[] subMass = new int[n];
            boolean[] used = new boolean[n];

            int index = 0;
            for(int len = 1; len <= word.length(); len++){
                for(int i = 0; i + len <= word.length(); i++){
                    String str = word.substring(i, i + len);
                    if(!Arrays.asList(subs).contains(str) && 
                    !Arrays.asList(subs).contains(reverse(str))){
                        subs[index] = str;
                        subMass[index] = stringMass(subs[index]);
                    }else {
                        subs[index] = "";
                        subMass[index] = 0;
                    }
                    index++;
                }
            }
            sort(subMass, subs);

            for(int i = 0; i < subs.length; i++){
                if(subMass[i] != 0){
                    System.out.print(subs[i]);
                    int tabs = subs[i].length() / 8;
                    for(int s = 0; s < spaces - tabs; s++)
                        System.out.print("\t");
                    System.out.println("|\t" + subMass[i]);
                }
            }
        }
    }

    public static String reverse(String str){
        String ret = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ret += str.charAt(i);
        }
        return ret;
    }

    public static int stringMass(String str){
        int mass = 0;
        for(int i = 0; i < str.length(); i++){
            int index = (str.charAt(i) - 65);
            if(index >= 0 && index <= MASSES.length - 1)
                mass += MASSES[index];
        }
        return mass;
    }

    public static void
    sort(int[] ints, String[] strs){
        if(ints.length == strs.length){
            int[] temp;
            do{
                temp = ints.clone();
                for(int i = 0; i < ints.length - 1; i++){
                    // if(ints[i] > ints[i + 1]  || 
                    // (ints[i] == ints[i + 1] && strs[i].compareTo(strs[i + 1]) > 0)){
                       if(strs[i].length() > strs[i + 1].length() ||
                       (strs[i].length() == strs[i + 1].length() &&
                        ints[i] > ints[i + 1])){
                        int tempInt = ints[i + 1];
                        String tempStr = strs[i + 1];
                        ints[i + 1] = ints[i];
                        strs[i + 1] = strs[i];
                        ints[i] = tempInt;
                        strs[i] = tempStr;                        
                    }
                }
            } while(!Arrays.equals(ints, temp));
        }
    }   

    public static void getMasses() throws IOException{
        Scanner read = new Scanner(new FileReader(FILEPATH));
        MASSES = new int[MAX_LETTERS];
        for(int i = 0; i < MAX_LETTERS; i++){
            MASSES[i] = read.nextInt();
        }
    }
}
