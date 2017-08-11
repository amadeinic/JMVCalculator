package com.nxa684.views;

import com.nxa684.panels.AdvancedPanel;
import com.nxa684.panels.BasicPanel;
import com.nxa684.panels.IntermediatePanel;
import com.nxa684.panels.NumbersPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by nicola on 03/12/16.
 */
public class CalcFrame extends JFrame {

    JPanel displayPanel;
    JPanel bottomGroupPanel;
    JLabel lblDisplay;

    CalcView view;


    public CalcFrame(CalcView view) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setPreferredSize(new Dimension(800,480));
        setResizable(false);
        setTitle("Calculator");
        setVisible(true);
        this.view = view;

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Mode");
        bar.add(menu);
        JMenuItem basicMode = new JMenuItem("Basic mode");
        JMenuItem intermedMode = new JMenuItem("Intermediate mode");
        JMenuItem advancedMode = new JMenuItem("Advanced mode");
        menu.add(basicMode);
        menu.add(intermedMode);
        menu.add(advancedMode);
        basicMode.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                view.changeMode(e.getActionCommand());
            }
        });
        intermedMode.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                view.changeMode(e.getActionCommand());
            }
        });
        advancedMode.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                view.changeMode(e.getActionCommand());
            }
        });
        this.setJMenuBar(bar);


        displayPanel = new JPanel();
        lblDisplay = new JLabel("Ready");
        lblDisplay.setFont(new Font("Sans", Font.PLAIN, 36));
        lblDisplay.setPreferredSize(new Dimension(800, 100));
        displayPanel.add(lblDisplay, BorderLayout.NORTH);
        add(displayPanel);

        bottomGroupPanel = new JPanel(new GridLayout(1,2));

        bottomGroupPanel.add(new NumbersPanel(this.view));

        bottomGroupPanel.add(new BasicPanel(this.view));

        add(bottomGroupPanel, BorderLayout.SOUTH);
        pack();
    }

    public void setResult(String result) {
        lblDisplay.setText(result);
        pack();
    }

    public void setMode(String mode) {
        this.remove(bottomGroupPanel);
        bottomGroupPanel = new JPanel(new GridLayout(1,2));
        bottomGroupPanel.add(new NumbersPanel(this.view));
        switch(mode) {
            case "Basic mode" : {
                bottomGroupPanel.add(new BasicPanel(this.view));
                break;
            }
            case "Intermediate mode" : {
                bottomGroupPanel.add(new IntermediatePanel(this.view));
                break;
            }
            case "Advanced mode" : {
                bottomGroupPanel.add(new AdvancedPanel(this.view));
                break;
            }
        }
        add(bottomGroupPanel, BorderLayout.SOUTH);
        pack();
    }


}
