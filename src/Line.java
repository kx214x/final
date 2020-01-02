package realApps;

import java.awt.Color;
import java.util.ArrayList;

final public class Line {

    private double a, b, c;
    private Color lineColor;
    private int thickness, unit, sHeight, sWidth;
    private double vX, vY;
    private ArrayList<double[]> cords = new ArrayList<double[]>();

    public Line(double tA, double tB, double tC, Color color, int thick, int nUnit, int height, int width) {

        a = tA;
        b = tB;
        c = tC;
        lineColor = color;
        thickness = thick;
        unit = nUnit;
        sHeight = height;
        sWidth = width;
        setVertex();
        setCoords();
    }

    public Line(double tA, double tB, double tC, int nUnit, int height, int width) {

        a = tA;
        b = tB;
        c = tC;
        lineColor = Color.blue;
        thickness = 2;
        unit = nUnit;
        sHeight = height;
        sWidth = width;
        setVertex();
        setCoords();
    }

    double getA() {

        return a;
    }
    void setA(double tA) {

        a = tA;
    }

    double getB() {

        return b;
    }
    void setB(double tB) {

        b = tB;
    }

    double getC() {

        return c;
    }
    void setC(double tC) {

        c = tC;
    }

    Color getColor() {

        return lineColor;
    }
    void setColor(Color cl) {

        lineColor = cl;
    }

    int getThickness() {

        return thickness;
    }
    void setThickness(int nThickness) {

        thickness = nThickness;
    }

    String getVertexAsString() {

        return "(" + vX + ", " + vY + ")";
    }

    double[] getVertex() {

        return new double[] {vX, vY};
    }

    private void setVertex() {

        vX = -(b/a/2);
        vY = c - a * Math.pow((b/a/2), 2);
    }

    void setCoords() {

        double px, nx, y;

        if(!(a == 0 && b == 0)) {
            for(int i = 0; true; i++) {

                y = a * i * i + b * i + c;
                if(y > sHeight / unit) {
                    px = i;
                    break;
                }
            }

            for(int i = 0; true; i--) {

                y = a * i * i + b * i + c;
                if(y > sHeight / unit) {
                    nx = i;
                    break;
                }
            }

            for(double i = nx; i < 0; i += 0.1) {

                y = a * i * i + b * i + c;
                cords.add(new double[] {i, y});

            }

            for(double i = 0; i < px; i += 0.1) {

                y = a * i * i + b * i + c;
                cords.add(new double[] {i, y});
            }
        } else {

            cords.add(new double[] {-sWidth, c});
            cords.add(new double[] {sWidth, c});
        }
    }

    ArrayList<double[]> getCoords() {

        return cords;
    }
}