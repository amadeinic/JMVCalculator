package com.nxa684.controllers;

import com.nxa684.models.CalcModel;

/**
 * Created by nicola on 04/12/16.
 */
public class CalcController {

    CalcModel model;

    public CalcController(CalcModel model) {
        this.model = model;
    }

    public void clearExpression() {
        model.clearExpression();
    }

    public String inputFrom(String buttonName) {
        switch(buttonName) {
            case "CLR": {
                model.clearExpression();
                return "";

            }
            case "=": {
                return String.valueOf(model.getResult());

            }
            case "MEM": {
                return model.updateMem();
            }
            default: {
                model.add(buttonName);
                return buttonName;

            }
        }
    }

    public String getResult() {
        return model.getResult();
    }
}
