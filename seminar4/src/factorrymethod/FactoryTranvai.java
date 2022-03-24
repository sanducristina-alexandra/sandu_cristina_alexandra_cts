package factorrymethod;

public class FactoryTranvai implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String numarInmatriculare) {
        return new Tranvai(numarInmatriculare);
    }
}
