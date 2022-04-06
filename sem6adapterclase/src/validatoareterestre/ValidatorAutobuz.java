package validatoareterestre;

public class ValidatorAutobuz implements ValidatorTerestru{

    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat biletul pt autobuz");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul pt autobuz");
    }
}
