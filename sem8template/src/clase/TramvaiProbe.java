package clase;

public class TramvaiProbe extends TranvaiAbstract{

    @Override
    public void opresteStatie1() {
        System.out.println("Tramvaiul pleaca de la inceputul liniei.");
    }

    @Override
    public void opresteStatie2() {
        System.out.println("Tramvaiul nu opreste.");
    }

    @Override
    public void opresteStatie3() {
        System.out.println("Tramvaiul ajunge la capat de linie.");
    }
}
