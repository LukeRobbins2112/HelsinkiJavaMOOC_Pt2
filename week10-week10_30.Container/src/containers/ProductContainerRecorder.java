
package containers;

public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory ContHist;    
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.ContHist = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    
    public String history(){
        return ContHist.toString();
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.ContHist.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double previousVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        this.ContHist.add(this.getVolume());
        return previousVolume - this.getVolume();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.ContHist.maxValue());
        System.out.println("Smallest product amount: " + this.ContHist.minValue());
        System.out.println("Average: " + this.ContHist.average());
        System.out.println("Greatest change: " + this.ContHist.greatestFluctuation());
        System.out.println("Variance: " + this.ContHist.variance());
    }
    
}
