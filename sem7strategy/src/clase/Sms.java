package clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Am platit suma de " + suma + " prin sms.");
    }
}
