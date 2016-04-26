/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Wachtwoordloos
 */
public class Field extends JPanel {

    private int sizeX;
    private int sizeY;
    private int puntId;
    private ArrayList<Point> points;

    public Field() {
        this.sizeX = 400;
        this.sizeY = 400;
        this.setPreferredSize(new Dimension(sizeX, sizeY));
        points = new ArrayList<>();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBackground(Color.WHITE);
        g.setColor(Color.GRAY);
        int x = 50;
        while (x < 400) {
            g.drawLine(x, 0, x, 400);
            x = x + 50;

        }
        x = 50;
        while (x < 400) {
            g.drawLine(0, x, 400, x);
            x = x + 50;

        }
        g.setColor(Color.CYAN);
        g.fillOval(10, 360, 30, 30);

    }

    public void addPoint() {

        points.add(new Point());
        int z = 0;


    }

    public void paintPoints() {
        int z = 0;
        while (z < points.size()) {
            points.get(z).setLayout(null);
            points.get(z).setPreferredSize(new Dimension(50, 50));
            points.get(z).setBounds(getX(), getY(), 25, 25);
            this.add(points.get(z));
            z++;
        }
        z = 0;
        this.validate();
        this.repaint();
    }

}
