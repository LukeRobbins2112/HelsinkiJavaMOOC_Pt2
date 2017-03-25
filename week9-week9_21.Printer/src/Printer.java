import java.io.*;
import java.util.Scanner;
 
public class Printer {

    private String fileName;
    private File file;
    
    public Printer(String fileName) throws Exception{
       this.fileName = fileName;
       this.file = new File(this.fileName);
    }
    
    public void printLinesWhichContain(String word) throws Exception{

        Scanner reader = new Scanner(this.file);
        
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)){
                System.out.println(line);
            }
        }
        
    }
}
