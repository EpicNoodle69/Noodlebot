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
public class Veld extends JPanel {

    private int sizeX;
    private int sizeY;
    private int puntId;
    private ArrayList<Punt> punten;

    public Veld() {
        this.sizeX = 400;
        this.sizeY = 400;
        this.setPreferredSize(new Dimension(sizeX, sizeY));
        punten = new ArrayList<>();
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
    }

    public void addPunt() {

        punten.add(new Punt());
        int z = 0;
        while (z < punten.size()) {
            punten.get(z).setLayout(null);
            punten.get(z).setPreferredSize(new Dimension(50, 50));
            punten.get(z).setBounds(getX(), getY(), 25, 25);
            this.add(punten.get(z));
            z++;
        }
        z = 0;
        this.validate();
        this.repaint();

    }

}
