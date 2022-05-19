package main;

import classes.Autobuz;
import classes.ManagerAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("Andrei", 4, "Dacia", 2000, 40);
        ManagerAutobuz manager= new ManagerAutobuz();
        manager.adaugaMemento(autobuz1.genereazaMemento());
        System.out.println(autobuz1);
        autobuz1.setNumeSofer("Viorel");
        System.out.println(autobuz1);
        manager.adaugaMemento(autobuz1.genereazaMemento());
        autobuz1.setConsumMediu(7);
        manager.adaugaMemento(autobuz1.genereazaMemento());
        System.out.println(autobuz1);
        autobuz1.revinoLaStareaAnterioara(manager.getMemento(0));
    }

}
