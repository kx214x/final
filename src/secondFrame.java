import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class secondFrame extends JFrame
{
    JSlider slider = new JSlider(JSlider.HORIZONTAL,-10,10,0);
    JTextArea textArea;
    secondFrame()
    {
        textArea = new JTextArea("This program will teach you about the transformations that can be applied to a quadratic graph. By using the sliders (as shown below), you can change the a, k, d, c values and observe the graph become shifted horizontally, vertically, and become stretched or compressed.");
        add(textArea, BorderLayout.NORTH);



        textArea.setFont(new Font("Serif", Font.ITALIC, 21));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        add(slider, BorderLayout.SOUTH);



    }

}
