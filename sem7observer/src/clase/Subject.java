package clase;

public interface Subject {
    void aboneazaObservator(Observer observer);
    void dezaboneazaObservator(Observer observer);
    void notify(String mesaj);
}
