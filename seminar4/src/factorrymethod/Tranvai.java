package factorrymethod;

public class Tranvai extends MijlocTransportComun {
    public Tranvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tranvai{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
