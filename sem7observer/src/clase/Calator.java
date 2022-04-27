package clase;

public class Calator implements Observer{

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteSms(String mesaj) {
        System.out.println(nume + " " + mesaj);
    }
}
