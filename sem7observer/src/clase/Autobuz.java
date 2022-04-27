package clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobuz implements Subject {
    private Set<Observer> observers;
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.observers = new HashSet<>();
        this.nrLinie = nrLinie;
    }

    @Override
    public void aboneazaObservator(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezaboneazaObservator(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String mesaj) {
       for(Observer observer:observers){
           observer.primesteSms(mesaj);
       }
    }

    public void pleacaDeLaCapat(){
        notify("Autobuzul cu nr " + nrLinie + " pleaca de la capat.");
    }
}
