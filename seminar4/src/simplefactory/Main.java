package simplefactory;

public class Main {
    public static void main(String[] args) {
        MijlocTransportComun mijloc1 = Factory.creareMijlocTransport(TipMijlocTransport.Autobuz,"RT2345");
        MijlocTransportComun mijloc2 = Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz,"ORBS2453545");
        MijlocTransportComun mijloc3 = Factory.creareMijlocTransport(TipMijlocTransport.Tranvai,"DJF2335");
        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }
}
