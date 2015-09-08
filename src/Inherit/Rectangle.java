package Inherit;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Figure {

    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.green);
        BasicStroke c = new BasicStroke(3);
        gr2d.setStroke(c);

        gr2d.setPaint(Color.MAGENTA);
        Rectangle2D.Double r = new Rectangle2D.Double();
        r.setRect(100, 100, 100, 100);
        ((Graphics2D) g).draw(r);

    }

    void doScale() {

    }

    float calcArea() {
        float a, b;
        a = 100;
        b = 100;
        float s = a * b;
        return s;
    }
}
