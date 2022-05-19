package main;

import classes.Autobuz;

public class Main {

    public static void main(String[] args) {
        Autobuz a1= new Autobuz(4);
        a1.pleacaInCursa();
        a1.ajungeLaCapatDeLinie();
        a1.pleacaInCursa();
        a1.trimiteInService();
        a1.ajungeLaCapatDeLinie();
        a1.trimiteInService();
        a1.scoateDinService();
    }
}
