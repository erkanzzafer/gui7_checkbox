/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui7_checkbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Gui7_checkbox {

    public static void main(String[] args) {

        JFrame f = new JFrame("Checkbox Örneği");
        JLabel lb = new JLabel("Seçim Yapınız");
        lb.setBounds(150, 50, 300, 50);
        JCheckBox ch1 = new JCheckBox("c++");
        JCheckBox ch2 = new JCheckBox("java");

        ch1.setBounds(150, 100, 250, 50);
        ch2.setBounds(150, 150, 250, 50);

        JButton btn = new JButton("Kontrol");
        btn.setBounds(150, 200, 100, 30);

        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("c++ seçim kutusu" + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
            }
        });

        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("Java seçim kutusu" + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ch1.isSelected()) {
                    System.out.println(ch1.getText() + " Seçildi!");
                }

                if (ch2.isSelected()) {
                    System.out.println(ch2.getText() + " Seçildi!");
                }

            }
        });

        f.add(ch1);
        f.add(lb);
        f.add(ch2);
        f.add(btn);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
