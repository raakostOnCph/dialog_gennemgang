package com.company;

public class Dansk implements Idalog {
    @Override
    public String AskUserForName() {
        return "hvad er dit navn";
    }

    @Override
    public String quit() {
        return "ønsker du at stoppe";
    }

    @Override
    public String byebye() {
        return "programmet er stoppet";

    }

    @Override
    public String switchLanguage() {
        return "ønsker du at skrive sprog ?";
    }


}
