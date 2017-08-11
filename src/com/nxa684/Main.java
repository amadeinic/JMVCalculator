package com.nxa684;

import com.nxa684.controllers.CalcController;
import com.nxa684.models.CalcModel;
import com.nxa684.views.CalcView;

public class Main {

    public static void main(String[] args) {
        CalcModel md = new CalcModel();
        CalcController cn = new CalcController(md);
        CalcView vw = new CalcView(cn);
    }
}
