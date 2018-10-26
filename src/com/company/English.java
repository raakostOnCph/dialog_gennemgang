package com.company;

public class English implements Idalog{


    @Override
    public String AskUserForName() {
        return "what is your name";
    }

    @Override
    public String quit() {
        return "do you want to quit ?";
    }

    @Override
    public String byebye() {
        return "the program has terminated";
    }

    @Override
    public String switchLanguage() {
        return "switch language ?";
    }
}
