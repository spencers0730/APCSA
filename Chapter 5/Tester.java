import java.util.*;

public class Tester
{
    public static void main()
    {
        ArrayList<Shapes> shapes = new ArrayList<Shapes>();
        for(int i = 0; i < 10; i++){
            int c = (int)(Math.random() * 3);
            Shapes s;
            int x = 40 * (i % 6);
            int y = 40 * (i % 4);
            int d = (int)(Math.random() * 30) + 10;
            switch(c){
                case 0:
                s = new Triangle(x, y, d);
                break;
                case 1:
                s = new Square(x, y, d);
                break;
                default:
                s = new Circle(x, y, d);
                break;
            }
            shapes.add(s);
        }

        for(Shapes s : shapes){
            s.makeInvisible();
        }

        Canvas.wait(1500);

        for(Shapes s : shapes){
            s.makeVisible();
        }

        Canvas.wait(1500);

        for(int i = 0; i < 20; i++){
            for(Shapes s : shapes){
                s.moveHorizontal(5);
            }

            Canvas.wait(100);
        }
        
        for(Shapes s : shapes){
            s.moveRightOne();
        }

        Canvas.wait(1500);

        for(Shapes s : shapes){
            s.moveLeftOne();
        }
        
        for(Shapes s : shapes){
            s.changeSize(60);
        }
    }
}