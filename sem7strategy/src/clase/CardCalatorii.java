package clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Am platit suma de " + suma + " prin card calatorii.");
    }
}
