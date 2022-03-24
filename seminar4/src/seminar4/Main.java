package seminar4;

public class Main {
    public static void main(String[] args) {
        SoferAutobuz soferAutobuz1 = SoferAutobuz.getInstance("Nume1");
        SoferAutobuz soferAutobuz2 = SoferAutobuz.getInstance("Nume2");
        System.out.println(soferAutobuz1.getNume());
        System.out.println(soferAutobuz2.getNume());
    }
}
