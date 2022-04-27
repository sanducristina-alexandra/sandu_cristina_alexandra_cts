package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz(2);
        Calator c1 = new Calator("Maria");
        Calator c2 = new Calator("Gigel");
        Calator c3 = new Calator("Andrei");
        a1.aboneazaObservator(c1);
        a1.aboneazaObservator(c2);
        a1.aboneazaObservator(c3);
        a1.pleacaDeLaCapat();

        a1.dezaboneazaObservator(c2);
        a1.pleacaDeLaCapat();
    }
}
