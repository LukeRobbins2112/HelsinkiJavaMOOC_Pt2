
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


public class GraphicCalculator implements Runnable {
    private JFrame frame;
    
    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(200, 100));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        this.frame.setLayout(layout);
        
        JTextField output = new JTextField("0");
        JTextField input = new JTextField();
        CalculatorPanel calcPanel = new CalculatorPanel();
        
        output.setEnabled(false);
        
        container.add(output);
        container.add(input);
        container.add(calcPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}