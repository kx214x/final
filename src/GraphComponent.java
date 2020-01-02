
package graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JComponent;


public class GraphComponent extends JComponent {


    int unit = 50, invRes = 10;
    // int xMin = -5;
    //int xMax =5;
    int numGridlinesX;
    int oneXunitPixel;
    // int yMin = -10;
    // int yMax =10;
    int numGridlinesY;
    int oneYunitPixel;



    public GraphComponent(int xMin, int xMax, int yMin, int yMax) {
        super();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        super.setSize(new Dimension((int) (screenSize.getHeight() * 0), (int) (screenSize.getHeight() * 0)));
         numGridlinesX = xMax - xMin;
         oneXunitPixel = 400/numGridlinesX;
         numGridlinesY = yMax - yMin;
        oneYunitPixel = 400/numGridlinesY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(Color.white);
        int width = super.getWidth();
        int height = super.getHeight();
        g2d.clearRect(1, 1, width, height);
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.gray);
        g2d.drawLine(600, 100,  600, 500);
        g2d.drawLine(400, 300, 800, 300);
        System.out.println("oneXunitPixel: " + oneXunitPixel);
        g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, new float[]{10, 0}, 0));
        for (int i = 0; i <= numGridlinesX; i++) {
            System.out.println("i: " + i);
            g2d.drawLine(400 + i * oneXunitPixel, 100, 400 + i * oneXunitPixel, 500);
        }
        for (int i = 0; i <= numGridlinesY; i++) {
            System.out.println("i: " + i);
            g2d.drawLine(400 , 100 + i * oneYunitPixel, 800 , 100 + i * oneYunitPixel);
        }

    }



}

