
/**
 * Write a description of class Tester here.
 * 
 * @author Mike Cullen 
 * @version September 10, 2017
 */
public class Tester
{
   public static void main()
   {
       Triangle bob=new Triangle();
       bob.makeVisible();
       bob.moveRight();
       
       Canvas.wait(1000);
       bob.moveRight();
       
       Circle circ1=new Circle();
       circ1.makeVisible();
       circ1.slowMoveHorizontal(1000);
    }
}
