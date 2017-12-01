import java.util.*;
public class InterTri{
    public static void main(String[] s){
        Scanner scan = new Scanner(System.in);
        String[] points = {"A", "B", "C"};
        Point[] outside = new Point[3];
        for(int i = 0; i < outside.length; i++){
            System.out.println(points[i] + "X");
            double x = scan.nextDouble();
            System.out.println(points[i] + "Y");
            double y = scan.nextDouble();
            outside[i] = new Point(x, y);
        }
        System.out.println("proportion");
        double t = scan.nextDouble();
        double totalArea = area(outside);
        if(totalArea == 0) 
            System.out.println("invalid triangle");
        else {
            Point[] midpoints = new Point[3];
            for(int i = 0; i < midpoints.length; i++){
                midpoints[i] = outside[i].proportionBetween(
                    outside[(i + 1) % outside.length], t);
            }
            Line[] sectors = new Line[3];
            for(int i = 0; i < sectors.length; i++){
                sectors[i] = new Line
                (outside[i], midpoints[(i + 1) % midpoints.length]);     
            }
            Point[] intersections = new Point[3];
            for(int i = 0; i < intersections.length; i++){
                intersections[i] = sectors[i].intersection
                (sectors[(i + 1) % sectors.length]); 
            }
            double internalArea = area(intersections);
            double ratio = internalArea / totalArea;

            // for(int i = 0; i < 3; i++){
                // System.out.println(outside[i].name + " " + midpoints[i].name + 
                    // " " + sectors[i].name + " " + intersections[i].name);
            // }

            System.out.println("total area " + totalArea + 
                "\ninternal area " + internalArea + "\nratio " + ratio);
        }
    }

    static double area(Point[] p){
        if(p.length != 3) return 0;
        double[] legs = new double[p.length];
        for(int i = 0; i < p.length; i++)
            legs[i] = p[i].distance(p[(i + 1)% p.length]);
        double s = sum(legs) / 2;
        double product = s;
        for(double d : legs)
            product *= (s - d);
        return Math.sqrt(product);
    }

    static double sum(double[] a){
        double sum = 0;
        for(double d : a)
            sum += d;
        return sum;
    }
}

class Point{
    double x, y;
    String name;
    Point(double x, double y){
        this.x = x;
        this.y = y;
        this.name = "(" + this.x + ", " + this.y + ")";
    }

    double distance(Point other){
        return Math.sqrt(
            Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    Point proportionBetween(Point other, double t){
        double u = 1 - t;
        return new Point(u * this.x + t * other.x, u * this.y + t * other.y);
    }
}

class Line{
    double m, b;
    String name;
    Line(double m, double b){
        this.m = m;
        this.b = b;
        this.name = "y = " + this.m + "x" + " + " + this.b;
    }

    Line(Point a, Point b){
        this.m = (b.y - a.y)/(b.x - a.x);
        this.b = a.y - this.m * a.x;
        this.name = "y = " + this.m + "x" + " + " + this.b;
    }

    double y(double x){
        return this.m * x + this.b;
    }

    Point intersection(Line other){
        double x = (this.b - other.b) / (other.m - this.m);
        return new Point(x, this.y(x));
    }

}