import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class thirdFrame extends JFrame
{
    JTextArea textArea;
    JTextArea textArea1;
    thirdFrame()
    {
        textArea = new JTextArea("A function transformation takes the base function of a graph and translates it while taking values from the equation in the form f(x) = a(k(x-d)) + c. ");
        textArea1 = new JTextArea("The a values can vertically stretch or compress a function's graph. If a > 1 the graph has been stretched vertically by a factor of |a|. If a < 0, the graph has been reflected in the y-axis by a factor of |a|. If 0 < |a| < 1, the graph has been vertically compressed by a factor of 1/|a|. If the a-value is negative, the graph has been reflected in the x-axis.");
        // textArea1 = new JTextArea("The k-values apply horizontal compression or stretch. If k > 1, then the graph has been compressed horizontally. If k < 0, then the graph has been reflected in the x-axis. If 0 < k < 1, then the graph has been stretched horizontally. The d values shift a function horizontally. if d is a positive number, then the graph shifts right horizontally. If d is a negative number, then the graph shifts left horizontally. Finally, the c-values translate the graph up or down, if c is a positive number, then the graph has been shifted up by c-units. If c is a negative number, then the graph has been shifted down by c units.  ");
        add(textArea, BorderLayout.NORTH);
        add(textArea1, BorderLayout.SOUTH);

        textArea.setFont(new Font("Serif", Font.ITALIC, 21));
        textArea1.setFont(new Font("Serif", Font.ITALIC, 21));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setOpaque(false);
        textArea1.setEditable(false);




    }

}
