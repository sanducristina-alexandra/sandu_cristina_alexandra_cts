package clase;

public abstract class TransportHandler {
    protected TransportHandler nextHandler;
    protected int pragDist;

    public void setNextHandler(TransportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void deplaseazaRequest(int distanta);

    public TransportHandler(int pragDist) {
        this.pragDist = pragDist;
        this.nextHandler = null;
    }
}
