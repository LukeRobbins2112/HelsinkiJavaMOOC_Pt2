//This is the class I wrote when doing the exercise by myself for the first time- it is not actually used in the program now.

import java.util.Scanner;
import java.util.HashMap;

public class Airport {
    
    private Scanner reader;
    private HashMap<String, Integer> planes;
    private HashMap<String, String> flights;
    
    public Airport(Scanner reader){
        this.reader = reader;
        this.planes = new HashMap<String, Integer>();
        this.flights = new HashMap<String, String>();
    }
    
    
    public void start(){
        System.out.println("Airport panel\n" +
        "--------------------\n" +
        "\n" +
        "Choose operation:\n" +
        "[1] Add airplane\n" +
        "[2] Add flight\n" +
        "[x] Exit\n");
        
      while (true){
          System.out.print(">");
          String input = reader.nextLine();
          
          if (input.equals("x")){
              break;
          }
          else if (input.equals("1")){
              this.addPlane();
          }
          else if (input.equals("2")){
              this.addFlight();
          }
          
      }
      
        System.out.println("Flight service\n" +
            "------------\n" +
            "\n" +
            "Choose operation:\n" +
            "[1] Print planes\n" +
            "[2] Print flights\n" +
            "[3] Print plane info\n" +
            "[x] Quit");
      
        while (true){
            System.out.print(">");
            String input = reader.nextLine();
            
            if (input.equals("x")){
                break;
            }
            else if (input.equals("1")){
                this.printPlanes();
            }
            else if (input.equals("2")){
                this.printFlights();
            }
            else if (input.equals("3")){
                this.printPlaneInfo();
            }
        }
        
    }
    
    public void addPlane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        this.planes.put(planeID, planeCapacity);
    }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.print("Give arrival airport code: ");
        String arrivalCode = reader.nextLine();
        String flightCode = "(" + departureCode + "-" + arrivalCode + ")";
        this.flights.put(planeID, flightCode);
    }
    
    public void printPlanes(){
        for (String key : this.planes.keySet()){
            System.out.println(key + " (" + this.planes.get(key) + " ppl)");
        }
    }
    
    public void printFlights(){
        for (String key : this.flights.keySet()){
            System.out.println(key + " (" + this.planes.get(key) + " ppl)" + " " + this.flights.get(key));
        }
    }
    
    public void printPlaneInfo(){
        System.out.println("Give plane ID: ");
        String searchedID = reader.nextLine();
        System.out.println(searchedID + " (" + this.planes.get(searchedID) + " ppl)");
    }
    
}

