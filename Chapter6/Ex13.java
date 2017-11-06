import java.util.*;

public class Ex13{
    public static void A(){
        ArrayList practice = new ArrayList();
        String base = "plant";
        for(int i = 0; i < 5; i++){
            practice.add(base.substring(0, i+1));
        }
        practice.add(new Integer(1));
        practice.add(new Double(3));
        System.out.println(practice);
        practice.set(1, base);
        practice.add(practice.get(4));
        practice.remove(4);
        System.out.println(practice);
    }

    public static void B(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 10; i <= 100; i+=10){
            list.add(i);
        }
        for(int i = 0; i < list.size(); i++){
            list.remove(i);
        }
        /*
        prediction : will print out every other one b/c i is incrementing but
                the object has been move b/c object before it was removed
         */
        System.out.println(list);
    }

    public static void C(){
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 2; i <= 10; i+=2){
            list2.add(i);
        }
        int size = list2.size();
        for(int i = 0; i < size; i++){
            list2.add(i, 42);
        }
        /*
        prediction : adds 42 to beginning the number of times that was equal to 
                the number of elements list2 had before the 42s because size is
                not updated
         */
        System.out.println(list2);
    }
}