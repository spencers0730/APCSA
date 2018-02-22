
public class Acedemia
{
    public static void main(){
        StudentExchange Jonas = new StudentExchange("Jonas", 7, "Germany");
        Student Frank = new Student("Frank", 6);
        Student Frank2 = new Student("Frank", 6);
        StudentAthlete Suki = new StudentAthlete("Suki", 5, "Soccer");

        System.out.println(Jonas + "\n");
        System.out.println(Frank + "\n");
        System.out.println(Suki + "\n");
        System.out.println(Frank.equals(Frank2));
    }
}
