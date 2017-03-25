import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class CalculatorPanel extends JPanel {
    
    public CalculatorPanel(){
        super(new GridLayout(1,3));
        createComponents();
    }
    
    public void createComponents(){
        add(new JButton("+"));
        add(new JButton("-"));
        add(new JButton("Z"));
    }
    
}
