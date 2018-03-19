package Ch7Exercise1;

public class MonetaryCoin extends Coin
{
    private int value;

    public MonetaryCoin(int value){
        // super();
        this.value = value;
    }
    
    public MonetaryCoin(){
        this(1);
    }
    
    public int getValue(){
        return value;
    }
    
    public String toString(){
        return super.toString() + " on a " + value; 
    }
}

