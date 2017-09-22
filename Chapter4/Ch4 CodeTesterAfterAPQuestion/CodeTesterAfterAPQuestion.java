
/**
 * Write a description of class codeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodeTesterAfterAPQuestion
{
    public static void main()
    {
        Code code=new Code("ABCdef123ghi456jklMNO");
        
        code.hide(2,7);
        System.out.println("\n"+code.getCode());
        code.recover(5,9);
        
        System.out.println("\n"+code.getCode());
        code.hide(3,14);
        System.out.println("\n"+code.getCode());
        code.hide(6,10);
        System.out.println("\n"+code.getCode());
        code.recover(5,6);
        System.out.println("\n"+code.getCode());
        code.recover(0,14);
        System.out.println("\n"+code.getCode());
    }
}