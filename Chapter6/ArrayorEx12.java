public class ArrayorEx12{
    public static void main(){
        int[][] array = {{7, 12, 17, 22, 15}, 
                         {5, 9, 13, 17, 21}, 
                         {5, -4, 13, 12, 18}};

        print2DArray(array);

        for(int j = 0; j < array[0].length; j++){
            array[2][j] = (j + 1) * 3;
        }

        print2DArray(array);
    }

    public static void print2DArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}