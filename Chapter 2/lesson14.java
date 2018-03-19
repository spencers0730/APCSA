import java.util.*;

public class lesson14
{
    public static void main(int num){
        for(int i = 0; i < num; i++){
            String n = "";
            n += rand(0, 7, 1) + rand(0, 7, 1) + rand(0, 7, 1);
            n += "-";
            n += rand(0, 741, 3);
            n += "-";
            n += rand(0, 9999, 4);
            System.out.println(n);
        }
    }
    
    public static String rand(int min, int max, int len){
        String str = "" + (int)(Math.random() * (max - min + 1) + min);
        while(str.length() < len){
            str = "0" + str;
        }
        return str;
    }
}