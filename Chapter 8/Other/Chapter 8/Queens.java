public class Queens{
    public static boolean[][] s = new boolean[8][8];

    public static void nonAttacking(int col){
        if(col >= 0 && col <=7){
            s[0][col] = true;
            placeOtherQueens(1);
        }
    }

    public static boolean canPlace(int r, int c){

        for(int i = 0; i < 7; i++){
            boolean rDown = r - i >= 0;
            boolean rUp = r + i < 8;
            boolean cDown = c - i >= 0;
            boolean cUp = c + i < 8;

            if(rDown){
                if(s[r-1][c]) return false;
            }
            if(rUp){
                if(s[r+1][c]) return false;
            }
            if(cDown){
                if(s[r][c-1]) return false;
            }
            if(cUp){
                if(s[r][c+1]) return false;
            }

            if(rDown && cDown)
                if(s[c - i][r - i])
                    return false;
            if(rUp && cUp)
                if(s[c + i][r + i])
                    return false;
            if(rDown && cUp)
                if(s[c + i][r - i])
                    return false;
            if(rUp && cDown)
                if(s[c - i][r + i])
                    return false;
        }

        return true;
    }

    public static void placeOtherQueens(int row){
        for(int i = 0; i < 8; i++){
            if(canPlace(row, i)) {
                s[row][i] = true;
                row++;
                if(row > 7)
                    finish();
                else 
                    placeOtherQueens(row);
            }
        }
    }

    public static void finish(){
        for(int r = 0; r < 8; r++){
            for(int c = 0; c < 8; c++){
                if(s[r][c])
                    System.out.print("Q");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
    }

    // public static int min(int a, int b){
    // return (a > b)? b : a;
    // }
}