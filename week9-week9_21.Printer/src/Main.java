import java.io.*;

public class Main {

    public static void main(String[] args) {
     
        try{
            Printer printer = new Printer("src/textfile.txt");
            printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
         

    
        
        
    }
}
