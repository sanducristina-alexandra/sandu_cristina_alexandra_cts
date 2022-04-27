package clase;

public class AutobuzDeNoapte implements MijlocTransport{

    private MijlocTransport autobuz;

    public AutobuzDeNoapte(MijlocTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori() == 0){
            System.out.println("Autobuzul nu se opreste in statie.");
        }else{
            System.out.println("Autobuzul opreste in statie");
        }
    }

    @Override
    public Integer getNrCalatori() {
        return autobuz.getNrCalatori();
    }

}
