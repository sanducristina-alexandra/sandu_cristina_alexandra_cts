package clase;

import java.util.concurrent.ExecutionException;

public interface NodAbstract {
    void afiseazaDescriere();

    NodAbstract get(int poz) throws ExecutionException;

    void add(NodAbstract nod) throws ExecutionException;

    void remove(NodAbstract nod) throws ExecutionException;
}
