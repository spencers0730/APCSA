public class ShortAnswer6{
    public static void switchThem(int[] a, int[] b){
        if(a.length == b.length){
            int[] temp = a.clone();
            switchTo(b, a);
            switchTo(temp, b);
        } else {
            System.out.println("Arrays are of different size.");
        }
    }

    public static void switchTo(int[] f, int[] t){
        if(f.length == t.length)
            for(int i = 0; i < f.length; i++){
                t[i] = f[i];
            }
    }

}