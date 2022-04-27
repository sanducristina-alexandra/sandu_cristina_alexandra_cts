package clase;

public class Tranvai extends TranvaiAbstract{
    @Override
    public void opresteStatie1() {
        System.out.println("Tranvaiul opreste la prima statie.");
    }

    @Override
    public void opresteStatie2() {
        System.out.println("Tranvaiul opreste la a doua statie.");
    }

    @Override
    public void opresteStatie3() {
        System.out.println("Tranvaiul opreste la a treia statie.");
    }
}
