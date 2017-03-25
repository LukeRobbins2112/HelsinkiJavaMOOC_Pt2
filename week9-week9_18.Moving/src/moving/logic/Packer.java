/*
package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;
import moving.domain.Item;

public class Packer {
    
    private int boxesVolume;
    private List<Box> boxes;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }
    
    
    public List<Box> packThings(List<Thing> things){
        
        boxes.add(new Box(this.boxesVolume));
        for (Thing t : things) {
            if (!boxes.get(boxes.size()-1).addThing(t)) {
                boxes.add(new Box(this.boxesVolume));
                boxes.get(boxes.size()-1).addThing(t);
            }
        }
        return boxes;
    }

    
    
    public List<Box> packThings(List<Thing> things){
        
        int thingsVolume = 0;
        
        for (Thing thing : things){
            thingsVolume += thing.getVolume();
        }
        
        for (int i = 0; i < (int)(thingsVolume / this.boxesVolume); i++){
            this.boxes.add(new Box(this.boxesVolume));
        }
        
        for (int i = 0; i < this.boxes.size(); i++){
            
            for (Thing thing : things){
                if (boxes.get(i).getVolume() + thing.getVolume() < this.boxesVolume){
                    boxes.get(i).addThing(thing);
                }
            }
            
        }
        
        return this.boxes;
    }
}
*/

package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author WONSEOB
 */
public class Packer {
    
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(this.boxesVolume));
        for (Thing t : things) {
            if (!boxes.get(boxes.size()-1).addThing(t)) {
                boxes.add(new Box(this.boxesVolume));
                boxes.get(boxes.size()-1).addThing(t);
            }
        }
        return boxes;
    }
}