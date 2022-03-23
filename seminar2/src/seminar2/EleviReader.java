package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader {
    EleviReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        super.getScanner().useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (super.getScanner().hasNext()) {
            Elev elev = new Elev();
            readAplicant(super.getScanner(), elev);
            int clasa = super.getScanner().nextInt();
            String tutore = super.getScanner().next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        super.getScanner().close();
        return elevi;
    }
}
