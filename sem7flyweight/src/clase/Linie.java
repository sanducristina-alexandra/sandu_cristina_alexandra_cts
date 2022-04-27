package clase;

public class Linie implements AutobuzLinie{

    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaDescriere(Autobuz autobuz) {
        System.out.println(this.toString() + autobuz.toString());
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
