/*

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PhoneSearch {
    
    private Map<Person, String> peopleNumbers;
    private Map<Person, String> peopleAddresses;
    private Scanner reader;
    
    
    public PhoneSearch(Scanner reader){
        this.peopleNumbers = new HashMap<Person, String>();
        this.peopleAddresses = new HashMap<Person, String>();
        this.reader = reader;
    }
    
    public void start(){
        
        System.out.print("phone search\n" +
        "available operations:\n" +
        " 1 add a number\n" +
        " 2 search for a number\n" +
        " 3 search for a person by phone number\n" +
        " 4 add an address\n" +
        " 5 search for personal information\n" +
        " 6 delete personal information\n" +
        " 7 filtered listing\n" +
        " x quit\n" +
        "\n");
        
        executeCommand();
                
    }
    
    public void executeCommand(){
         String command = "";
        
        while (true){
            
            System.out.println("command: ");
            command = reader.nextLine();
            
            if (command.equals("x")){
                break;
            }
            else if (command.equals("1")){
                addPhoneNumber();
            }
            else if (command.equals("2")){
                getPhoneNumbers();
            }
            else if (command.equals("3")){
                getPersonByPhoneNumber();
            }
            else if (command.equals("4")){
                addAddress();
            }
            else if (command.equals("5")){
                searchForInfo();
            }
            else if (command.equals("6")){
                deleteInfo();
            }
            else if (command.equals("7")){
                filteredListing();
            }
            else{
                System.out.println("Enter a valid command");
            }
        
        }
    }
    
    public void addPhoneNumber(){
        System.out.println("whose number: ");
        String name = this.reader.nextLine();
        System.out.println("number: ");
        String number = this.reader.nextLine();
        
        Person p = new Person(name);
        p.addToPhoneNumbers(number);
        
        this.peopleNumbers.put(p, number);
    }
    
    public String getPhoneNumbers(){
        System.out.println("whose number: ");
        String whoseNumber = this.reader.nextLine();
        
        for (Person p : this.peopleNumbers.keySet()){
            
            if (p.getName().equals(whoseNumber)){
                System.out.println(p.getPersonsPhoneNumbers());
                return p.getPersonsPhoneNumbers();
            }
        }
        
        System.out.println("not found");
        return "not found";
    }
    
    public String getPersonByPhoneNumber(){
        System.out.print("number: ");
        String searchNumber = this.reader.nextLine();
        
        for (String num : this.peopleNumbers.values()){
            if (num.equals(searchNumber)){
                for (Person p : this.peopleNumbers.keySet()){
                    if (p.getPersonsPhoneNumbers().contains(searchNumber)){
                        System.out.println(p.getName());
                        return p.getName();
                    }
                }
            }
        }
        
        System.out.println("not found");
        return "not found";
    }
    
    public void addAddress(){
        System.out.println("whose address: ");
        String name = reader.nextLine();
        System.out.println("street: ");
        String address = reader.nextLine() + " ";
        System.out.println("city: ");
        address += reader.nextLine();
        
        Person p = new Person(name);
        p.addAddress(address);
        this.peopleAddresses.put(p, address);

    }  
       
    public void searchForInfo(){
        System.out.println("whose information: ");
        String whoseInformation = reader.nextLine();
        
        for (Person p : this.peopleAddresses.keySet()){
            if (p.getName().equals(whoseInformation)){
                if (p.getAddresses().isEmpty()){
                    System.out.println("  address unknown");
                }
                else{
                    System.out.println("  address: " + p.getAddresses());
                }
                
            }
        }
        
        for (Person p : this.peopleNumbers.keySet()){
            
            if (p.getName().equals(whoseInformation)){
                if (p.getPersonsPhoneNumbers().isEmpty()){
                    System.out.println("  phone number not found");
                }
                else{
                    System.out.println("  phone numbers: ");
                    System.out.println("  " + p.getPersonsPhoneNumbers());
                }
                
            }
        }
        
        
    }
    
    public void deleteInfo(){
        System.out.println("whose information: ");
        String whoseInfo = reader.nextLine();
        
        for (Person p : this.peopleNumbers.keySet()){
            if (p.getName().equals(whoseInfo)){
                this.peopleNumbers.remove(p);
            }
        }
        
        for (Person p : this.peopleAddresses.keySet()){
            if (p.getName().equals(whoseInfo)){
                this.peopleAddresses.remove(p);
            }
        }
        
    }
    
    public void filteredListing(){
        System.out.println("keyword (if empty, all listed): ");
        String filter = reader.nextLine();
        String emptyChecker = "";
        
        if (filter.equals("")){
            System.out.println(this.peopleAddresses.toString() + "\n" + this.peopleNumbers.toString());
        }
        
        else{
            for (Person p : this.peopleAddresses.keySet()){
                if (p.getAddresses().contains(filter) || p.getName().contains(filter)){
                    System.out.println(p.toString());
                    emptyChecker += "not empty";
                }
            }
            
            for (Person p : this.peopleNumbers.keySet()){
                if (p.getAddresses().contains(filter) || p.getName().contains(filter)){
                    System.out.println(p.toString());
                    emptyChecker += "not empty";
                }
            }
        }
        
        if (emptyChecker.equals("")){
            System.out.println(" keyword not found");
        }
    }
    
    
    
    
    
}
*/