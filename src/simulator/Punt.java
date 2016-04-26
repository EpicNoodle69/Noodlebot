/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Wachtwoordloos
 */
public class Punt extends JComponent {

    private int x;
    private int y;
    private int middleX;
    private int middleY;

    public Punt() {
        int z = 0;
        while (z == 0) {
        this.x = (int) (Math.random() * 400);
            this.y = (int) (Math.random() * 400);
                z++;
            }
        }
        y = y / 50;
        y = (int) Math.round(y);
        y = y * 50;
        x = x / 50;
        x = (int) Math.round(x);
        x = x * 50;
        middleX = x + 20;
        middleY = y + 20;

        System.out.println("X: " + x + " Y: " + y);


    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public int getmiddleX() {
        return middleX;
    }

    public int getmiddleY() {

        return middleY;
    }





    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(10, 10, 30, 30);

    }



}
