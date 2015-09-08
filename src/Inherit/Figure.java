package Inherit;

import javax.swing.JFrame;


public abstract class Figure extends JFrame{

    public Figure() {
        super("simpleApp");
        setSize(700, 700);
        setVisible(true);
    }


    abstract void doScale();
    abstract float calcArea();
    void move(){

    }
}
