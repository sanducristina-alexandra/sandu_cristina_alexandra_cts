package clase;

public class TramvaiHandler extends TransportHandler{
    public TramvaiHandler(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta<pragDist){
            System.out.println("Se va folosi tramvaiul.");
        }else{
            nextHandler.deplaseazaRequest(distanta);
        }
    }
}
