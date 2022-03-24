package factorrymethod;

public class Main {
    public static void modulAfisareMijlocTransport(Factory factory, String nrInmatricare) {
        MijlocTransportComun mijlocTransportComun = factory.creareMijloc(nrInmatricare);
        System.out.println(mijlocTransportComun.toString());
    }
    public static void main(String[] args) {
       // Factory factory = new FactoryAutobuz();
       // System.out.println(factory.creareMijloc("merge"));
        modulAfisareMijlocTransport(new FactoryAutobuz(),"ekjhfwoj");
        modulAfisareMijlocTransport(new FactoryMicrobuz(),"ekjhfwoj");
    }
}
