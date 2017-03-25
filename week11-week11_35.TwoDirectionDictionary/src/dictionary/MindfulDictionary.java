
package dictionary;

import java.util.*;

public class MindfulDictionary {
    
    private Map<String, String> dictionary;
    
    public MindfulDictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public String translate(String word){
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        else if (this.dictionary.containsValue(word)){
            for (String s : this.dictionary.keySet()){
                if (this.dictionary.get(s).equals(word)){
                    return s;
                }
            }
        }
        
        return null;
    }
    
}
