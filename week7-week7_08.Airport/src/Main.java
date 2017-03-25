import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
         Scanner reader = new Scanner(System.in);
        
        //Airport air = new Airport(reader);
        //air.start();
        
        AirPortManager manager = new AirPortManager(reader);
        manager.start();
        
    }
    

}

