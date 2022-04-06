package main;

import clase.Autobuz;
import clase.Grup;
import clase.NodAbstract;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        NodAbstract a1 = new Autobuz("Dacia","kjedh",7);
        NodAbstract a2 = new Autobuz("Dacia","kjedh",12);
        NodAbstract a3 = new Autobuz("Dacia","kjedh",45);
        NodAbstract grupMici = new Grup("autobuze mici");
        NodAbstract grupMari = new Grup("autobuze mari");
        NodAbstract flota = new Grup("Flota");
        try {
            grupMici.add(a1);
            grupMici.add(a2);
            grupMari.add(a3);
            flota.add(grupMici);
            flota.add(grupMari);
            flota.afiseazaDescriere();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
