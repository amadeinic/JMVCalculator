package com.nxa684.panels;

import com.nxa684.views.CalcView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nicola on 05/12/16.
 */
public class IntermediatePanel extends JPanel{

    CalcView view;

    public IntermediatePanel(CalcView view) {
        super(new GridLayout(3,2));
        this.view = view;
        JButton[] nButtons = new JButton[30];
        nButtons[0] =new JButton(".");
        nButtons[1] = new JButton("=");
        nButtons[2] = new JButton("+");
        nButtons[3] = new JButton("-");
        nButtons[4] = new JButton("*");
        nButtons[5] = new JButton("/");
        for (int i=0; i<=5; i++) {
            nButtons[i].addActionListener(e -> view.inputFrom(e.getActionCommand()));
            this.add(nButtons[i]);
        }
    }
}
