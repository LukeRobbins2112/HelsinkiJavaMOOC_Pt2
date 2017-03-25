
package application;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Random;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        
         if (sensors.isEmpty()) {
            return false;
        }
        
        for (Sensor sensor : sensors){
           if (!sensor.isOn()){
               return false;
           }
        }
        return true;
    }

    @Override
    public void on() {
        for (int i = 0; i < this.sensors.size(); i++){
            this.sensors.get(i).on();
        }
        
    }

    @Override
    public void off() {
        
        Random r = new Random();
        
        this.sensors.get(0).off();
        for (int i = 1; i < this.sensors.size(); i++){
            int onOrOff = r.nextInt();
            
            if (onOrOff == 1){
                this.sensors.get(i).off();
            }
            
        }
    }

    @Override
    public int measure() {
        int averageReading = 0;
        
        if (!isOn()){
            throw new IllegalStateException();
        }
        
        for (Sensor sensor : sensors){
            averageReading += sensor.measure();
        }
        
        averageReading /= this.sensors.size();
        
        readings.add(averageReading);
        
        return averageReading;
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){

        return this.readings;
    }
    
}
