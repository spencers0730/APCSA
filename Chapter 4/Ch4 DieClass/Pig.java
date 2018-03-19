import java.util.*;
public class Pig{
    static Scanner scan = new Scanner(System.in);
    
    static final int COMPUTER = 1;
    static final int COMPUTERTURNSATSCORE = 20;
    
    static final int MAXSCORE = 100;
    static final char[] EXITCHARS = new char[]{'q', 's'};
    static final int players = 2;
    static final int startDie = 2;
    
    static final int EXITVAL = -1;
    
    static int[] scores;
    static int[] numDie;

    static int run;
    public static void main(){
        scores = new int[players];
        numDie = new int[players];
        for(int i = 0; i < numDie.length; i++){
            numDie[i] = startDie;
        }
        run = 0;

        Die d = new Die(6);
        while(run == 0){
            for(int i = 0; i < players && run == 0; i++){
                System.out.println("p" + (i + 1) + "'s turn.");
                printScoresDies(scores, numDie);
                if(numDie[i] != 0){ 
                    boolean t = ask(i); 
                    if(run == 0){
                        System.out.println("p" + (i + 1) + ((t) ? " turned" : " pigged") + ".");
                        if(t){
                            numDie[(i + 1) % players] += numDie[i];
                            numDie[i] = 0;
                        }
                        else {
                            int ones = 0;
                            int addScore = 0;
                            int[] rs = new int[numDie[i]];
                            for(int j = 0; j < numDie[i]; j++){
                                int r = d.roll();
                                System.out.println("p" + (i+1) + " rolled a " + r);
                                addScore += r;
                                if(r == 1) ones++;
                            }
                            if(ones >= 1) addScore = 0;
                            if(ones >= 2) {
                                numDie[(i + 1) % players] += numDie[i];
                                numDie[i] = 0;
                                scores[i] = 0;
                            }
                            scores[i] += addScore;
                        }
                    }
                    run = (scores[i] >= MAXSCORE) ? i : 0;
                } 
            }
        }
        String out = "Thanks for playing!";
        if(run != EXITVAL) out += "\np" + (run + 1) + " won!";
        System.out.println(out);
        
    }

    static void printScoresDies(int[] scores, int[] die){
        for(int i = 0; i < scores.length; i++){
            System.out.print("p" + (i + 1) + " has " + scores[i] + " score and " +
                die[i] + " di" + ((die[i] == 1) ? "" : "c") + "e" +
                ((i != scores.length - 1) ? " and " : ".\n"));
        }
    }

    static boolean ask(int p){
        System.out.println("does p" + (p + 1) +" want to roll or turn.");
        char c;
        if(p != COMPUTER){
            c = scan.next().toLowerCase().charAt(0);
        } else {
            c = (scores[COMPUTER] >= COMPUTERTURNSATSCORE) ? 't': 'r';
        }
        for(int i = 0; i < EXITCHARS.length && run != EXITVAL; i++){
            run = (c == EXITCHARS[i]) ? EXITVAL : run;
        }
        return c == 't';
    }
}