package Inherit;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Circle extends Figure{

    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setPaint(Color.BLACK);
        gr2d.drawRoundRect(200, 80, 400, 400, 400, 400);
    }



    void doScale() {

    }

    float calcArea() {
        return 12;
    }
}
