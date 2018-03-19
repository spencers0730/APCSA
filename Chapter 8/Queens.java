public class Queens {
    public static int[] colVal = new int[8];

    public static void nonAttacking(int col){
        if(col >= 0 && col <= 7){
            colVal[0] = col;
            placeOtherQueens(1);
        }
    }

    private static void placeOtherQueens(int row){
        for(int i = 0; i < 8; i++){
            if(canPlace(row, i)){
                colVal[row] = i;
            }
        }
        if(row >= 7)
        {
            finished();
        }
        else
            placeOtherQueens(row + 1);
    }

    private static boolean canPlace(int row, int col){
        for(int i = 0; i <= row; i++){
            if(i != row && col == colVal[i]) return false;
            if(row - i >= 0){
                if(colVal[row - i] == col - i || colVal[row - i] == col + i) return false;
            }
        }
        return true;
    }

    public static void finished(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++)
                System.out.print((colVal[i] == j) ? "Q" : "X");
            System.out.println();
        }
    }
}