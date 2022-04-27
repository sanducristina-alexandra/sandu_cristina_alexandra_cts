package clase;

public class TroleibuzHandler extends TransportHandler{
    public TroleibuzHandler(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta<pragDist){
            System.out.println("Folosim troleibuzul");
        }else{
            nextHandler.deplaseazaRequest(distanta);
        }
    }
}
