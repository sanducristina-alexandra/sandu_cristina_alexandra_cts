package clase;

public class MetrouHandler extends TransportHandler{
    public MetrouHandler(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int distanta) {
        System.out.println("Se foloseste metroul");
    }
}
