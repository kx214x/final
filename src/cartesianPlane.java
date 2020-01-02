import javax.swing.*;
import java.awt.*;

public class cartesianPlane extends JFrame {

    public cartesianPlane() {

        setSize(500, 531);
        setBackground(Color.WHITE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);

        for(int i = 31; i < 531; i += 20) {

            g.drawLine(0, i, 500, i);

        }

        for(int i = 20; i < 500; i += 20) {

            g.drawLine(i, 0, i, 531);

        }

    }



    public static void main(String args[]) {

        new cartesianPlane();

        

    }

}
