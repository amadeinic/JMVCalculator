package com.nxa684.views;

import com.nxa684.controllers.CalcController;
import com.nxa684.views.CalcFrame;

/**
 * Created by nicola on 04/12/16.
 */
public class CalcView {

    CalcFrame frame;
    CalcController controller;

    public CalcView(CalcController controller) {
        this.frame = new CalcFrame(this);
        this.controller = controller;
    }

    public void inputFrom(String buttonName) {
        setResult(controller.inputFrom(buttonName));
    }

    public void setResult(String result) {
        frame.setResult(result);
    }

    public void changeMode(String mode) {
        frame.setMode(mode);
    }
}
