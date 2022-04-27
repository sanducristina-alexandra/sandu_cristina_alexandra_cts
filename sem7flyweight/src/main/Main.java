package main;

import clase.Autobuz;
import clase.Linie;
import clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("model1",2006,35);
        Autobuz a2 = new Autobuz("model2",2010,14);
        Autobuz a3 = new Autobuz("model3",2013,34);
        Autobuz a4 = new Autobuz("model4",2007,45);
        LinieFactory factory = new LinieFactory();
        Linie l1 = factory.getLinie(168);
        Linie l2 = factory.getLinie(137);
        l1.afiseazaDescriere(a1);
        l2.afiseazaDescriere(a2);
        l1.afiseazaDescriere(a3);
        l2.afiseazaDescriere(a4);
    }
}
