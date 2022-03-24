package factorrymethod;

public class Microbuz extends MijlocTransportComun{
    public Microbuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Microbuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
