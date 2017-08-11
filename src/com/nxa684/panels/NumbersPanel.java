package com.nxa684.panels;

import com.nxa684.views.CalcView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nicola on 05/12/16.
 */
public class NumbersPanel extends JPanel {

    CalcView view;

    public NumbersPanel(CalcView view) {
        super(new GridLayout(4, 3));
        this.view = view;
        JButton[] nButtons = new JButton[30];
        nButtons[0] =new JButton("MEM");
        nButtons[1] = new JButton("CLR");
        for (int i = 2; i <= 11; i++) {

            JButton btn = new JButton(String.valueOf(i-2));
            btn.setPreferredSize(new Dimension(30,60));
            nButtons[i] = btn;
        }

        for (int i=11; i>=0; i--) {
            nButtons[i].addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    view.inputFrom(e.getActionCommand());
                }
            });
            this.add(nButtons[i]);
        }
    }
}
