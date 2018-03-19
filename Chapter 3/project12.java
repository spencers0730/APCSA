import java.util.*;

public class project12{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("a, b, c, or d:");
            char option = scan.nextLine().charAt(0);
            switch(option){
                case 'a':
                a();
                break;
                case 'b':
                b();
                break;
                case 'c':
                c();
                break;
                case 'd':
                d();
                break;
            }
        }
    }

    static void a(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print("");
            }
            System.out.println();
        }
    }

    static void b(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void c(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (10 - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void d(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <  2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >= 0; i--){
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <  2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}