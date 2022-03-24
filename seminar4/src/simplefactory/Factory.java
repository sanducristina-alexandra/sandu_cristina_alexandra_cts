package simplefactory;

public class Factory {
    public static MijlocTransportComun creareMijlocTransport(TipMijlocTransport tipMijlocTransport,String nrInmatriculare) {
        switch (tipMijlocTransport){
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tranvai:
                return  new Tranvai(nrInmatriculare);
            case Troleibuz:
                return  new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
