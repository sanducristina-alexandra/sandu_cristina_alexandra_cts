package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        TransportHandler tramvai = new TramvaiHandler(3);
        TransportHandler autobuz = new AutobuzHandler(5);
        TransportHandler troleibuz = new TroleibuzHandler(10);
        TransportHandler metrou = new MetrouHandler(20);
        tramvai.setNextHandler(autobuz);
        autobuz.setNextHandler(troleibuz);
        troleibuz.setNextHandler(metrou);
        tramvai.deplaseazaRequest(1);

        TransportHandler autobuzArad = new AutobuzHandler(2);
        TransportHandler troleibuzArad = new TroleibuzHandler(7);
        autobuzArad.setNextHandler(troleibuzArad);
        autobuzArad.deplaseazaRequest(6);

    }
}
