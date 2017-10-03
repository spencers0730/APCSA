import java.util.*;

public class WordToMass{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter a word to be massified:");
            String word = scan.next().toUpperCase();
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
                    if(!Arrays.asList(subs).contains(str)){
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

    public static int stringMass(String str){
        int mass = 0;
        for(int i = 0; i < str.length(); i++){
            mass += (str.charAt(i) - 64);
        }
        return mass;
    }

    public static void sort(int[] ints, String[] strs){
        if(ints.length == strs.length){
            int[] temp;
            do{
                temp = ints.clone();
                for(int i = 0; i < ints.length - 1; i++){
                    if(ints[i] > ints[i + 1]  || 
                    (ints[i] == ints[i + 1] && strs[i].compareTo(strs[i + 1]) > 0)){
                        int tempInt = ints[i + 1];
                        String tempStr = strs[i + 1];
                        ints[i + 1] = ints[i];
                        strs[i + 1] = strs[i];
                        ints[i] = tempInt;
                        strs[i] = tempStr;                        
                    }
                }
                // System.out.println(Arrays.toString(ints) + " " + Arrays.toString(temp));
            } while(!Arrays.equals(ints, temp));
            // System.out.println(Arrays.toString(ints) + " " + Arrays.toString(strs));
        }
    }   
}
