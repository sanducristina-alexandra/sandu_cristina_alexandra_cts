package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(0,"eeeehh");
        autobuz.opresteInStatie();
        ((Autobuz)autobuz).setNrCalatori(2);
        MijlocTransport autobuzNoapte = new AutobuzDeNoapte(autobuz);
        autobuzNoapte.opresteInStatie();
    }
}
