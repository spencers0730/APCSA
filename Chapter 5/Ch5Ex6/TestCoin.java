package Ch5Ex6;


/**
 * Write a description of class TestCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCoin
{
    public static void main()
    {
        final int flips=25;
        int key=10;
        
        Coin myCoin = new Coin();
        myCoin.setKey(key);
        
        for (int count=1;count<=flips;count++)
        {myCoin.flip();
            System.out.println(myCoin);
            if(count%10==0)
            myCoin.lock(key);
            else if (count%5==0)
            myCoin.unlock(key);
        }
    }
}
