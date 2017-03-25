
package containers;

import java.util.*;

public class ContainerHistory {
    
    private List<Double> containerHistory;
    
    public ContainerHistory(){
        this.containerHistory = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.containerHistory.add(situation);
    }
    
    public void reset(){
        this.containerHistory.clear();
    }
    
    public String toString(){
        return this.containerHistory.toString();
    }
    
    public double maxValue(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        
        double max = 0;
        
        for (Double d : this.containerHistory){
            if (d > max){
                max = d;
            }
        }
        
        return max;
        
    }
    
    public double minValue(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        
        double min = this.maxValue();
        
        for (Double d : this.containerHistory){
            if (d < min){
                min = d;
            }
        }
        
        return min;
        
    }
    
    public double average(){
        double total = 0;
        
        for (Double d : this.containerHistory){
            total+=d;
        }
        
        return total/this.containerHistory.size();
    }
    
    public double greatestFluctuation(){
        
        if (containerHistory == null || containerHistory.size() == 1) {
            return 0;
        }
        
        double greatestFluc = 0, fluc = 0, lastVal = containerHistory.get(0);
        
        for (double d : containerHistory) {
            fluc = Math.abs(lastVal - d);
            if (fluc > greatestFluc) {
                greatestFluc = fluc;
            }
            lastVal = d;
        }
        return greatestFluc;
    }
    
    public double variance(){
        double totalVar = 0;
        
        for (Double d : this.containerHistory){
            totalVar += Math.pow((d - average()), 2);
        }
        
       return totalVar/(this.containerHistory.size() - 1);
    }
    
    
    
    
}
