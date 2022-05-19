package classes;

public class AutobuzMemento {
    private String nume;
    private  Integer consum;

    public AutobuzMemento(String nume, Integer consum) {
        this.nume = nume;
        this.consum = consum;
    }

    public String getNume() {
        return nume;
    }

    public Integer getConsum() {
        return consum;
    }
}
