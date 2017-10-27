public class asd{
    public static void main(){
        int sum = 0;
        for(int i = 100000; i < 1000000; i++){
            if(PalindromeTester.isPalindrome(i + "") && i % 11 == 0) sum++;
        }
        System.out.println(sum);
    }
}