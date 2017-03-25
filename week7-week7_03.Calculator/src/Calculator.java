
public class Calculator {
    
    private Reader reader;
    private int statistics;
    
    public Calculator(){
        reader = new Reader();
        this.statistics = 0;
    }
    
    private void sum() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("sum of the valyes " + (value1 + value2));
       this.statistics++;
    }
    
    private void difference() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("difference of the values " + (value1 - value2));
       this.statistics++;
    }
    
    private void product() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("product of the values " + (value1 * value2));
       this.statistics++;
    }

    private void statistics(){
        System.out.println("Calculations done " + this.statistics);
    }
    
     public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
}
