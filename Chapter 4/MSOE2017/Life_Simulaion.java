import java.util.*;
import java.io.*;
public class Life_Simulaion
{
    static final boolean ALIVE = true;
    static final boolean DEAD = false;
    
    public static void main(String[] s) throws IOException
    {
        System.out.println("Enter the file name");
        Scanner console = new Scanner(System.in);
        String address = console.nextLine();
        Scanner scan = new Scanner(new File(address));
        String dimensions = scan.nextLine();
        Scanner di = new Scanner(dimensions);
        int n = di.nextInt();
        int m = di.nextInt();
        boolean[][] board = new boolean[n][m];
        for(int i5 = 0; i5 < m && scan.hasNextLine(); i5++){
            String line = scan.nextLine();
            for(int j5 = 0; j5 < n; j5++){
                board[i5][j5] = 
                Integer.valueOf(line.substring(j5, j5+1)) == 1;
            }
        }
        // while(true){
            for(int i = 0; i < 10; i++){
            printBoard(board); 
            board = nextGen(board);
        }
    }

    public static boolean[][] nextGen(boolean[][] board){
        boolean[][] temp = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int neighbors = 0; 
                for(int i2 = i - 1; i2 <= i + 1; i2++){
                    for(int j2 = j - 1; j2 <= j + 1; j2++){
                        if(i2 >= 0 && i2 < board.length && 
                        j2 >= 0 && j2 < board[0].length && !(i2 == i && j2 == j)){
                            if(board[i2][j2]) {
                                neighbors++;}
                        }
                    }
                }
                if(board[i][j] == ALIVE) { //if alive
                    // next[i][j] = (neighbors == 2 || neighbors == 3);
                    if(neighbors < 2 || neighbors > 3) {temp[i][j] = DEAD;}
                    else {temp[i][j] = ALIVE;}
                }
                else { //temp[i][j] = neighbors == 3;
                    if(neighbors == 3){ temp[i][j] = ALIVE;}
                    else{ temp[i][j] = DEAD;}
                }
            }
        }
        return temp;
    }

    public static void printBoard(boolean[][] board){
        for(boolean[] b : board){
            for(boolean c : b){
                System.out.print((c) ? "1" : "0");}
            System.out.println();
        }
        for(int i = 0; i < 10; i++) System.out.print("=");
        System.out.println();
    }
}