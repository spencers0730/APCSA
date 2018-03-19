package GCD;

import java.io.*;
import java.util.*;

    public class Tester{
        
        int fileNum = 0;
        final String fileorigin; 
        Tester(String f){
            fileorigin = f;
        }
        
        void run(int start, int last) throws IOException
        {            
            int size = last - start + 1;
            int maxArr = 1000000;
            int arrSize = (size * size / 2); 
            arrSize = Math.min(arrSize, maxArr);
            
            long startTime = System.nanoTime();
            String[] lines = new String[maxArr];
            int indx = 0;
        
            for(int i = start; i <= last; i++)
            {
                for(int j = i; j <= last; j++)
                {
                    lines[indx] = (i + "," + j + "," + commonFact.commonFact(i, j));
                    if(indx + 1 == lines.length)
                    {
                        write(lines, indx);
                        Arrays.fill(lines, "");
                        indx = 0; 
                    }
                    else indx++;
                    }
            }
           
            if(indx != 0)
                write(lines, indx);            
            long endTime = System.nanoTime();
            double time = ((endTime-startTime)/1e9);
            System.out.println("\nThat took " + time + " seconds.");
    
            }
    
        public void write(String[] lines, int index) throws IOException
        {
            String filepath = fileorigin + "output" + fileNum +".txt"; 
            // String name = lines[0].substring(0, lines[0].indexOf(",")) 
                // + "," + lines[0].substring(lines[0].indexOf(",") + 1,
                    // lines[0].indexOf(",", lines[0].indexOf(",") + 1))  + 
                        // "-" + lines[index].substring(0, lines[index].indexOf(",")) 
                            // + "," + lines[index].substring(lines[index].indexOf(",") + 1,
                                // lines[index].indexOf(",", lines[index].indexOf(",") + 1));
            // String filepath = fileorigin + name + ".txt";
            fileNum++;
            write.printTo(filepath, lines);
        }

}

 
