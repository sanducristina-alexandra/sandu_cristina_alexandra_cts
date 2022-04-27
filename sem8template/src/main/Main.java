package main;

import clase.TramvaiProbe;
import clase.Tranvai;
import clase.TranvaiAbstract;

public class Main {
    public static void main(String[] args) {
        TranvaiAbstract tranvaiAbstract = new Tranvai();
        TranvaiAbstract tranvaiAbstract1 = new TramvaiProbe();
        tranvaiAbstract.parcurgereTraseu();
        tranvaiAbstract.parcurgereTraseuInvers();
        tranvaiAbstract1.parcurgereTraseu();
        tranvaiAbstract1.parcurgereTraseuInvers();
    }
}
