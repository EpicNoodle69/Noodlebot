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
        JFrame Frame = new JFrame();
        Generate = new JButton("Genereer");
        Spacing = 75;

        Frame.setSize(1500, 600);
        Frame.setLayout(Layout);

        Frame.add(Bruteforce);
        Frame.setVisible(true);
        Layout.setHgap(Spacing);
        Frame.add(Greedy);
        Frame.setVisible(true);
        Layout.setHgap(Spacing);
        Frame.add(Noodler);
        Frame.add(Generate);
        Generate.addActionListener(this);

        Generate.setVisible(true);
        Frame.setVisible(true);
        Frame.setTitle("TSP Simulator");

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        int x = 0;
        while (x < 60) {

            x++;
        }
    }

}
