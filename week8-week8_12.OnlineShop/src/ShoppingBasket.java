import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        
        if (this.basket.containsKey(product)){
            this.basket.get(product).increaseAmount();      
        }
        else{
            Purchase added = new Purchase(product, 1, price);
        this.basket.put(product, added);
        }

    }
    
    public int price(){
        int basketPrice = 0;
        
        for (Purchase pur : this.basket.values()){
            basketPrice += pur.price();
        }
        
        return basketPrice;
    }
    
    public void print(){
        
        for (String item : this.basket.keySet()){
            System.out.println(this.basket.get(item));
        }
        
    }
    
    
    
}
