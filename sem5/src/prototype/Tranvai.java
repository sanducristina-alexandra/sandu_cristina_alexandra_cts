package prototype;

public class Tranvai extends MijlocTransport{
    private String numeVarman;

    public Tranvai(String nr, String numeVarman) {
        super(nr);
        this.numeVarman = numeVarman;
    }

    public String getNumeVarman() {
        return numeVarman;
    }

    public void setNumeVarman(String numeVarman) {
        this.numeVarman = numeVarman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tranvai{");
        sb.append("numeVarman='").append(numeVarman).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
