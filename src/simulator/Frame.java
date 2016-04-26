/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

    private Field Bruteforce;
    private Field Greedy;
    private Field Noodler;
    private int Spacing;
    private JButton Generate;

    public Frame() {
        FlowLayout Layout = new FlowLayout();
        Bruteforce = new Field();
        Greedy = new Field();
        Noodler = new Field();
        JFrame Scherm = new JFrame();
        Generate = new JButton("Genereer");
        Spacing = 75;

        Scherm.setSize(1500, 600);
        Scherm.setLayout(Layout);

        Scherm.add(Bruteforce);
        Scherm.setVisible(true);
        Layout.setHgap(Spacing);
        Scherm.add(Greedy);
        Scherm.setVisible(true);
        Layout.setHgap(Spacing);
        Scherm.add(Noodler);
        Scherm.add(Generate);
        Generate.addActionListener(this);

        Generate.setVisible(true);
        Scherm.setVisible(true);
        Scherm.setTitle("TSP Simulator");

        Scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        int x = 0;
        while (x < 60) {

            x++;
        }
    }

}
