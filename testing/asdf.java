public class asdf{
    public static void main(){
        int sum = 10;
        for(int i = 0; i < 11; i++){
            for(int j = 1; j < 10 - i; j++){
                sum += j * (j - 1) / 2;
            }
        }
        System.out.println(sum);
    }
}