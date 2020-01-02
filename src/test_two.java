import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import javax.swing.JSlider;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;


public class test_two<layoutConst> implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label;
    JSlider slider = new JSlider(JSlider.HORIZONTAL,-10,10,0);
    GridBagConstraints layoutConst;

    JTextField outputField = null;
    private Component JPanel;

    graph.GraphComponent graphArea;




    {

    }

    public test_two() {

        gui();
    }


    private void gui() {
        frame = new JFrame("Transformations");
        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.yellow);

        button1 = new JButton("Need help?");

        label = new JLabel("");
        button1.addActionListener(this);

        graphArea = new graph.GraphComponent(-5,5,-10,10);
        graphArea.repaint();
        GridBagConstraints c = new GridBagConstraints();

        panel.add(button1);
        panel.add(label);
        frame.add(panel, BorderLayout.SOUTH);

        panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        button2 = new JButton("What are Transformations?");


        frame.add(button2, BorderLayout.NORTH);
        frame.add(graphArea,BorderLayout.CENTER);

        button2.addActionListener(this);

        }


    public static void main(String[] args) {

        new test_two();

    }

    @Override
    public void actionPerformed(ActionEvent event)
    {

        if(event.getActionCommand().equals(("Need help?"))){
            secondFrame frame1 = new secondFrame();
            frame1.setVisible(true);
            frame1.setSize(500,700);
            frame1.setTitle("Help");

            frame1.pack();
            frame1.setVisible(true);
            frame1.setSize(500, 250);

        }
        if(event.getActionCommand().equals(("What are Transformations?"))){
            thirdFrame frame2 = new thirdFrame();
            frame2.setVisible(true);
            frame2.setSize(200,200);
            frame2.setTitle("What are Transformations?");

            frame2.pack();
            frame2.setVisible(true);
            frame2.setSize(700,350);
        }

    }
}

