package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {
    AngajatiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        super.getScanner().useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (super.getScanner().hasNext()) {
            Angajat angajat = new Angajat();
            readAplicant(super.getScanner(), angajat);
            int salariu = super.getScanner().nextInt();
            String ocupatie = super.getScanner().next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        super.getScanner().close();
        return angajati;
    }
}
