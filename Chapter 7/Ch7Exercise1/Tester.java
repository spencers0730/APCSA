public class Tester
{
    public static void main(){
        MonetaryCoin nickel = new MonetaryCoin(5);
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin quarter = new MonetaryCoin(25);

        MonetaryCoin penny = new MonetaryCoin();

        int total = 0;
        total += nickel.getValue();
        total += dime.getValue();
        total += quarter.getValue();
        total += penny.getValue();
        
        for(int i = 0; i < 10; i++){
            dime.flip();
            System.out.println(dime);
            nickel.flip();
            System.out.println(nickel);
        }
    }
}
