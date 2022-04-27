package main;

import clase.Decorator;
import clase.DecoratorOcazional;
import clase.Printer;
import clase.PrinterBilet;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterBilet();
        Decorator decorator = new DecoratorOcazional(printer,"La multi ani!");
        printer.printeazaBilet();
        decorator.printeazaMesaj();
    }
}
