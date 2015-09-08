package Inherit;

import java.awt.*;
import java.lang.Math.*;

public class Tringle extends Figure {

    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.green);
        BasicStroke c = new BasicStroke(3);
        gr2d.setStroke(c);

        gr2d.setPaint(Color.MAGENTA);
        Polygon j = new Polygon();
        j.addPoint(200, 20);
        j.addPoint(100, 200);
        j.addPoint(300, 200);
        g.drawPolygon(j);
    }

    void drowFigure(Graphics g) {

    }

    void doScale() {}


    float calcArea() {
        return 12;
    }

    // Calc tringle area
   /* float calcLengthLine(float a, float b, float c){
            // |AB|? = (y2 - y1)? + (x2 - x1)?
        return ;
    }

    float calcArea() {
        float p,a,b,c;  // S = ?p(p - a)(p - b)(p - c)
        a = 10;
        b = 10;
        c = 10;
        p = (a + b + c)/2;
        float s = (float) Math.sqrt(p*(p - a)*(p - b)*(p - c));

        return s;
    }
    */
}
