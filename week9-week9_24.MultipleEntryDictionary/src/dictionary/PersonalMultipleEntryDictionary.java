
package dictionary;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;


public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    
    private Map<String, Set<String>> entries;
    
    public PersonalMultipleEntryDictionary(){
        this.entries = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.entries.containsKey(word)){
            this.entries.put(word, new HashSet<String>());
        }
        
        this.entries.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.entries.get(word);
    }

    @Override
    public void remove(String word) {
        this.entries.remove(word);
    }
    
}
