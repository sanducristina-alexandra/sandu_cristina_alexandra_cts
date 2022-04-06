package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Grup implements NodAbstract {

    private List<NodAbstract> lista;
    private String denumire;

    public Grup(String denumire) {
        super();
        this.denumire = denumire;
        lista = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("denumire grup: " + this.denumire);
        for (NodAbstract nod : lista) {
            nod.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException {
        return lista.get(poz);
    }

    @Override
    public void add(NodAbstract nod) throws ExecutionException {
        lista.add(nod);
    }

    @Override
    public void remove(NodAbstract nod) throws ExecutionException {
        lista.remove(nod);
    }
}
