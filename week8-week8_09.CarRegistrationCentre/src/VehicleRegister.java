import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        
        if (this.owners.get(plate) == null){
            this.owners.put(plate, owner);
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public String get(RegistrationPlate plate){
        
        if (this.owners.get(plate) == null){
            return null;
        }
        
        return this.owners.get(plate);
        
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        }
        
        return false;
        
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : this.owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> used = new ArrayList<String>();
        
        for (RegistrationPlate plate : this.owners.keySet()){
            if (!used.contains(this.owners.get(plate))){
                System.out.println(this.owners.get(plate));
                used.add(this.owners.get(plate));                
            }

        }
    }
    
}
