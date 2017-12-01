import java.util.*;
/**
 * Write a description of class InternalTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InternalTriangle
{
    /**
     * Constructor for objects of class InternalTriangle
     */
    public static void main (String [] s)
    {
        Scanner kbReader=new Scanner (System.in);
        System.out.println("Enter Ax");
        double Ax=kbReader.nextDouble();
        System.out.println("Enter Ay");
        double Ay=kbReader.nextDouble();
        System.out.println("Enter Bx");
        double Bx=kbReader.nextDouble();
        System.out.println("Enter By");
        double By=kbReader.nextDouble();
        System.out.println("Enter Cx");
        double Cx=kbReader.nextDouble();
        System.out.println("Enter Cy");
        double Cy=kbReader.nextDouble();
        System.out.println("Enter a proportion, t.");
        double t=kbReader.nextDouble();
        double [] c=new double []{Cx,Cy};
        double [] b=new double []{Bx,By};
        double [] a=new double []{Ax,Ay};
        double wholeArea=Area(c,b,a);
        if(wholeArea<=0)
        {
            System.out.println("This is not a triangle.");
        }
        else {
            double[] ca=newPoint(c,a,t);
            double[] ab=newPoint(a,b,t);
            double[] bc=newPoint(b,c,t);
            // printArray(ca);
            // printArray(ab);
            // printArray(bc);
            double [] lineA=line(a,bc);
            double [] lineB=line(b,ca);
            double [] lineC=line(c,ab);
            // printArray(lineA);
            // printArray(lineB);
            // printArray(lineC);
            double [] intersectAB=intersection (lineA,lineB);
            double [] intersectBC=intersection (lineB,lineC);
            double [] intersectAC=intersection (lineC,lineA);
            // printArray(intersectAB);
            // printArray(intersectBC);
            // printArray(intersectAC);
            double internal=Area(intersectAB,intersectBC,intersectAC);
            double areaprop=internal/wholeArea;
            System.out.println("The whole area is "+wholeArea+" The internal area is " +internal+" The ratio is "+areaprop);
        }
    }

    public static double [] newPoint (double [] point1, double[] point2, double prop)
    {
        double [] point=new double [2];
        point [0]=prop*point1[0]+(1-prop)*point2[0];
        point [1]=prop*point1[1]+(1-prop)*point2[1];
        return point;
    }

    public static double [] intersection (double [] line1, double [] line2)
    {
        double x= (line1[1]-line2[1])/(line2[0]-line1[0]);
        double y=line1[1]+line1[0]*x;
        double [] intersection=new double[2];
        intersection [0]=x;
        intersection [1]=y;
        return intersection;
    }

    public static double [] line (double[] a, double[] b)
    {
        double m=(b[1]-a[1])/(b[0]-a[0]);
        double inter=b[1]-m*b[0];
        double [] line=new double [2];
        line [0]=m;
        line [1]=inter;
        return line;
    }

    public static double Area(double[] A, double[] B, double[] C)
    {
        double ab=distance(A,B);
        double bc=distance(B,C);
        double ac=distance(A,C);
        double semi=(ab+bc+ac)/2;
        if(ab+bc<=ac||ac+bc<=ab||ac+ab<=bc)
            return 0;
        else {
            double area=Math.sqrt((semi-ab)*(semi-bc)*(semi-ac)*semi);
            return area;
        }
    }

    public static double distance(double[] A, double[] B)
    {
        double sum=0;
        for (int i=0; i<=1; i++)
        {
            sum+=(A[i]-B[i])*(A[i]-B[i]);
        }
        return Math.sqrt(sum);
    }
    
    // public static void printArray(double[] a){
        // for(double d : a) System.out.print(d + " ");
        // System.out.println();
    // }
}

