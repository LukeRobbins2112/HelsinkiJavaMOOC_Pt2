/*
package moving.domain;

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {
    
    private int maximumCapacity;
    private int currentCapacity;
    private List<Thing> boxItems;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = 0;
        this.boxItems = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        
        if ((this.currentCapacity + thing.getVolume()) < this.maximumCapacity){
            this.boxItems.add(thing);
            this.currentCapacity += thing.getVolume();
            return true;
        }
        
        return false;
    }

    @Override
    public int getVolume() {
        return this.currentCapacity;
    }
    
}

*/

package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WONSEOB
 */
public class Box implements Thing {
    
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        int currentVolume = 0;
        for (Thing t : things) {
            currentVolume += t.getVolume();
        }
        if ((currentVolume+thing.getVolume()) > maximumCapacity) {
            return false;
        } else {
            things.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing t : things) {
            currentVolume += t.getVolume();
        }
        return currentVolume;
    }
}