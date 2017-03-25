
package tools;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;


public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> noDupes;
    private int numberOfDuplicates;
    
    public PersonalDuplicateRemover(){
        this.noDupes = new HashSet<String>();
        this.numberOfDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (this.noDupes.contains(characterString)){
            this.numberOfDuplicates++;
        }
        else{
            this.noDupes.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.numberOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.noDupes;
    }

    @Override
    public void empty() {
        this.noDupes.clear();
        this.numberOfDuplicates = 0;
    }
    
}
