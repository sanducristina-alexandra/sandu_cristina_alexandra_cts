package prototype;

public class Autobuz extends MijlocTransport{
    private String numeSofer;

    public Autobuz(String nr, String numeSofer) {
        super(nr);
        this.numeSofer = numeSofer;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException{
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
