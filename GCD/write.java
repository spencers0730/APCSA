import java.io.*;
import java.util.*;

public class write
{
    public static void printTo(String filepath, String[] text) throws IOException
    {
        PrintWriter output = new PrintWriter(new FileWriter(filepath));
        
        for(int i = 0; i < text.length; i++)
        {
            String line = text[i];
            if(line == null)
                break;
            output.println(line);
        }
        
        output.close();    
    }
}