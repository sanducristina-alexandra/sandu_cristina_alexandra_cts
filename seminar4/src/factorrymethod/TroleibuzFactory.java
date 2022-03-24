package factorrymethod;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Troleibuz(numarInmatriculare);
    }
}
