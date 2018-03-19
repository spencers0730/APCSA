public class Pascal {
    public static void row(int r){
        String ret = "";
        for(int i = 0; i <= r; i++){
            ret += element(r, i) + " ";
        }
        System.out.println(ret);
    }

    public static int element(int r, int c){
        if(c == 0 || r == c)
            return 1;
        return element(r - 1, c) + element(r - 1, c - 1);
    }
}