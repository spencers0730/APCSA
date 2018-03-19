package Ch7Exercise3;

public class President extends Executive{
    private double stockOptions;

    public President(String eName, String eAddress, String ePhone,
    String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        stockOptions = 0;
    }

    public void awardOptions(double options) {
        stockOptions = options;
    }
    
    public double pay(){
        super.awardBonus(stockOptions);
        stockOptions = 0;
        return super.pay();
    }
}