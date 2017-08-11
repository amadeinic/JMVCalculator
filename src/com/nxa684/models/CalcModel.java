package com.nxa684.models;

import com.nxa684.utils.Resolver;

/**
 * Created by nicola on 04/12/16.
 */
public class CalcModel {

    String expression;
    double mem;
    private boolean didCalc;
    private double lastRes;

    public CalcModel() {
        this.expression = "";
        mem = 0;
        lastRes=0;
        didCalc = true;
    }

    public String getResult() {
        try {
            double r = Resolver.eval(expression);
            lastRes = r;
            clearExpression();
            didCalc = true;
            return String.valueOf(r);
        } catch (Exception ex) {
            clearExpression();
            return "ERROR";
        }

    }

    public void add(String what) {
        expression = expression+what;
        didCalc=false;
    }

    public void clearExpression() {
        expression="";
    }

    public String updateMem() {
        if(didCalc) {
            mem = lastRes;
            return "Memory set!";
        } else {
            add(String.valueOf(mem));
            return String.valueOf(mem);
        }
    }
}
