package Inherit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
public class Circle extends Figure{

    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setPaint(Color.BLACK);
        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
        gr2d.setPaint(Color.DARK_GRAY);
    }

    public void drowFigure(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setPaint(Color.BLACK);
        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
        gr2d.setPaint(Color.DARK_GRAY);
    }

    void doScale() {

    }

    void calcArea() {

    }
}
