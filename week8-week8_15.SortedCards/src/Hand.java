import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card card : this.hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand h){
       int thisHand = 0;
       int comparedHand = 0;
       
       for (Card c : this.hand){
           thisHand += c.getValue() ;
       }
       
       for (Card c : h.hand){
           comparedHand += c.getValue();
       }
        
        
        return thisHand - comparedHand;
    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue cardsSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, cardsSorter);
    }
    
}
