package classes;

public class Autobuz {
    String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void plecarePeTraseu(int linie){
        System.out.println("Autobuzul cu nr de inmatriculare "+nrInmatriculare+" a plecat pe traseul liniei "+linie);
    }
}
