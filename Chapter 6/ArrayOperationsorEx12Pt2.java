public class ArrayOperationsorEx12Pt2{
    public static int max(int[][] a){
        if(a.length == 0 || a[0].length == 0) return 0;
        int max = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                max = Math.max(max, a[i][j]);
            }
        }
        return max;
    }

    public static int rowSum(int[][] a, int x){
        if(a.length == 0 || a[0].length == 0) return 0;
        int sum = 0;
        for(int i = 0; i < a[x].length; i++){
            sum += a[x][i];
        }
        return sum;
    }
    
    public static int columnSum(int[][] a, int x){
        if(a.length == 0 || a[0].length == 0) return 0;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i][x];
        }
        return sum;
    }
    
    public static int[] allRowSums(int[][] a){
        boolean oneZero = false;
        for(int i = 0; i < a.length && !oneZero; i++)
            oneZero = a[i].length == 0;
        if(a.length == 0 || oneZero) return new int[]{};
        int[] sums = new int[a.length];
        for(int i = 0; i < a.length; i++){
            sums[i] = rowSum(a, i);
        }
        return sums;
    }
}