import java.util.*;

public class commonFact
{
  public static int commonFact(int a, int b)
  {
     if(a == 1 || b == 1) return 1;
     if(a == 0) return b;
     if(b == 0) return a;
     
     int min = Math.min(a, b);
     int max = Math.max(a, b);
     
     return commonFact(min, max % min);
  }
}
