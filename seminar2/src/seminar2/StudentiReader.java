package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    StudentiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        super.getScanner().useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (super.getScanner().hasNext()) {
            Student student = new Student();
            readAplicant(super.getScanner(), student);
            int an_studii = super.getScanner().nextInt();
            String facultate = (super.getScanner().next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        super.getScanner().close();
        return studenti;
    }
}
