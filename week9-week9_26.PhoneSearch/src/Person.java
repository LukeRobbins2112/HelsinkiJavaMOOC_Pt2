/*

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private Set<String> phoneNumbers;
    private Set<String> addresses;
    
    public Person(String name){
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.addresses = new HashSet<String>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addToPhoneNumbers(String number){
        this.phoneNumbers.add(number);
    }
    
    public String getPersonsPhoneNumbers(){
        return this.phoneNumbers.toString();
    }
    
    public void addAddress(String address){
        this.addresses.add(address);
    }
    
    public String getAddresses(){
        return this.addresses.toString();
    }
    
    public String toString(){
        return this.name + " " + this.addresses.toString() + this.phoneNumbers.toString();
    }
    
}
*/

public class Person {
    
    private String name;
    private String address;
    private String number;
    
}