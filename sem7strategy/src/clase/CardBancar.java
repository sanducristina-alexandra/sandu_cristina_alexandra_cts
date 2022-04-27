package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Am platit suma de " + suma + " prin card bancar.");
    }
}
