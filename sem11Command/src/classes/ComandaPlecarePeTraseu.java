package classes;

public class ComandaPlecarePeTraseu implements Comanda{
    private int numarLinie;
    private Autobuz autobuz;

    public ComandaPlecarePeTraseu(int numarLinie, Autobuz autobuz) {
        this.numarLinie = numarLinie;
        this.autobuz= autobuz;
    }

    @Override
    public void executa() {
        autobuz.plecarePeTraseu(numarLinie);
    }
}
