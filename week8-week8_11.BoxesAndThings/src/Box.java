import java.util.ArrayList;

public class Box implements ToBeStored {
    
    private double maxWeight;
    private ArrayList<ToBeStored> box;
    
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<ToBeStored>();
        
    }
    
    public double weight(){
        
        double totalWeight = 0;
        
        for (ToBeStored thing : this.box){
            totalWeight += thing.weight();
        }
        
        return totalWeight;
    }
    
    public void add(ToBeStored thing){
       
        if (this.weight() + thing.weight() <= this.maxWeight){
            this.box.add(thing);
        }
       
    }
    
    public String toString(){
        return "Box: " + this.box.size() + " things, total weight " + this.weight() + " kg";
    }
    
}
