import java.util.ArrayList;

public class Changer {
    
    private ArrayList<Change> changedWord;
    
    public Changer(){
        changedWord = new ArrayList<Change>();
        
    }
    
    public void addChange(Change change){
        changedWord.add(change);
    }
    
    public String change(String characterString){
        
        for (Change object : changedWord){
            characterString = object.change(characterString);
        }
        
        return characterString;
    }
    
    
}
