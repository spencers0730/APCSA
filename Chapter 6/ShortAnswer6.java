public class ShortAnswer6{
    public static void switchThem(int[] a, int[] b){
        if(a.length == b.length){
            int[] temp = a.clone();
            a = b.clone();
            b = temp;
        } else {
            System.out.println("Arrays are of different size.");
        }
    }
}