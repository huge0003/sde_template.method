package com.hz;

public abstract class Card {

    protected Printer printer;

    public void print() {

        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    public abstract void printHeader();
    public abstract void printMessage();
    public abstract void printImage();
    public abstract void printFooter();


}
