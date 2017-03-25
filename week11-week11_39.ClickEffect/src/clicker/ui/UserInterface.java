package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc){
        this.calc = calc;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);
        
        JLabel clicks = new JLabel("0");
        JButton clickButton = new JButton("Click!");
        
        ClickListener cl = new ClickListener(this.calc, clicks); 
        clickButton.addActionListener(cl);
        
        container.add(clicks);
        container.add(clickButton);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
