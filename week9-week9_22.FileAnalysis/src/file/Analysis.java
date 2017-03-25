
package file;

import java.io.*;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    
    public Analysis(File file){
        this.file = file;
        
    }
    
    public int lines() throws FileNotFoundException{
        
        Scanner r  = new Scanner(this.file);
        int numberOfLines = 0;
        
        while (r.hasNextLine()){
            r.nextLine();
            numberOfLines++;
        }
       
        return numberOfLines;
    }
    
    public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        
        String string = "";
        
        while (reader.hasNextLine()){
            string += reader.nextLine();
        }
        
        return string.length() + lines();
        
    }
    
}
