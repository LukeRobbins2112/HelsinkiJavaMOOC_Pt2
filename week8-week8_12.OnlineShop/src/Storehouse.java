import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    
    private Map<String, Integer> pricedProducts;
    private Map<String, Integer> stockProducts;
    
    public Storehouse(){
        this.pricedProducts = new HashMap<String, Integer>();
        this.stockProducts = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.pricedProducts.put(product, price);
        this.stockProducts.put(product, stock);
    }
    
    public int price(String product){
        if (!this.pricedProducts.containsKey(product)){
            System.out.println("This item is not in the storehouse.");
            return -99;
        }
        return this.pricedProducts.get(product);
    }
    
    public int stock(String product){
        if (!this.stockProducts.containsKey(product)){
            System.out.println("This item is not in the storehouse.");
            return 0;
        }
        
        return this.stockProducts.get(product);
    }
    
    public boolean take(String product){
        
        
        if (this.stockProducts.containsKey(product)){
            
            if (this.stockProducts.get(product) == 0){
                return false;
            }
            
            int newStockNumber = this.stockProducts.get(product) - 1;
            this.stockProducts.remove(product);
            this.stockProducts.put(product, newStockNumber);
            return true;
            
        }
        
        return false;
        
    }
    
    public Set<String> products(){
        return this.pricedProducts.keySet();
    }
    
}
