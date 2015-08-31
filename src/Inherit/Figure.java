package Inherit;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.*;

public abstract class Figure extends JFrame{
    public Figure() {
        super("simpleApp");
        setSize(700, 600);
        setVisible(true);
    }
      public void paint(Graphics g){}

     void drowFigure(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setPaint(Color.BLACK);
        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
        gr2d.setPaint(Color.DARK_GRAY);
    }
    abstract void doScale();
    abstract void calcArea();
    void move(){

    }
}
