public class PairOfDice{
    public static void main(){
        Die d1 = new Die(6);
        Die d2 = new Die(6);
        int doubleSixes = 0;
        int nearMisses = 0;
        double totalRolls = 1000;
        for(int i = 0; i < totalRolls; i++){
            int r1 = d1.roll();
            int r2 = d2.roll();
            if(r1 == 6 && r1 == r2){
                doubleSixes++;
            }
            else if(r1 + r2 == 11){
                nearMisses++;
            }
        }
        System.out.println("doubleSixes " + doubleSixes + " nearMisses " + nearMisses + 
            " ratio of doubleSixes to totalRolls " + (doubleSixes / totalRolls));
    }
}