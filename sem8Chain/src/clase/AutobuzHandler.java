package clase;

public class AutobuzHandler extends TransportHandler{
    public AutobuzHandler(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta<pragDist){
            System.out.println("Folosim autobuzul.");
        }else{
            nextHandler.deplaseazaRequest(distanta);
        }
    }
}
