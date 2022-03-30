package prototype;

public abstract class MijlocTransport implements Cloneable{
    private String nr;

    public MijlocTransport(String nr) {
        this.nr = nr;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public abstract MijlocTransport copiaza() throws CloneNotSupportedException;
}
