public class EnterAnswersHere
{
   int count=3;
   
   public void main()
   {
      //You may skip Questions 1 and 2
      
      //3
      int k=1, p=0;
      int m = 97;
      while (m <= 195)
      {
         k = k * k + 3 * m;
         p = p + m + 1;
         m++;
      }
      SOP("k: " + k + " p: " + p);

      //4
      double q=0;
      k=1;
      int v = 2;
      do
      {
         k = k * k + 3 * v;
         q = Math.sqrt(q + v + 1);
         v *= 3;
      } while (v <= 195);
      SOP("k: " + k + " q: " + q);
      
      count++;
      
      //6
      SOP("No ; after do");
     
      //7
      SOP("infinite");
     
      //8
      SOP("101 - 25 = 76");
      
      //9
      count++;
      
      //10
      int i = 0, j = 0;
      SOP("");
      while (i <= 3)
      {
          for (j = 0; j <= 2; j++)
          {
              System.out.print(i + "," + j + " ");
            }
          i++;
        }
     
      //11
      SOP("break;");
     
      //12
      SOP("either while or for");
      
    }
    
   
}


