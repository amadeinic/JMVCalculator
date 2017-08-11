package com.nxa684.panels;

import com.nxa684.views.CalcView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nicola on 05/12/16.
 */
public class AdvancedPanel extends JPanel{

    CalcView view;

    public AdvancedPanel(CalcView view) {
        super(new GridLayout(7,2));
        this.view = view;
        JButton[] nButtons = new JButton[30];
        nButtons[0] =new JButton(".");
        nButtons[1] = new JButton("=");
        nButtons[2] = new JButton("(");
        nButtons[3] = new JButton(")");
        nButtons[4] = new JButton("+");
        nButtons[5] = new JButton("-");
        nButtons[6] = new JButton("*");
        nButtons[7] = new JButton("/");
        nButtons[8] = new JButton("sqrt");
        nButtons[9] = new JButton("^");
        nButtons[10] = new JButton("sin");
        nButtons[11] = new JButton("cos");
        nButtons[12] = new JButton("tan");
        for (int i=0; i<=12; i++) {
            nButtons[i].addActionListener(e -> view.inputFrom(e.getActionCommand()));
            this.add(nButtons[i]);
        }
    }
}
