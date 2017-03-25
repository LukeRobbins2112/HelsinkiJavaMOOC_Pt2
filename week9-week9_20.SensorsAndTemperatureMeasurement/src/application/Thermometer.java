
package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean isOn;
    
    public Thermometer(){
        this.isOn = false;
    }
    
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        
        Random r = new Random();
        
        if (isOn()){
            return (r.nextInt(61) + -30);
        }
        else{
            throw new IllegalStateException("The sensor is off");
        }
    }
    
}
