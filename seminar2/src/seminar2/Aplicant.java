package seminar2;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Aplicant {
    protected static Integer pragPunctaj = 80;
    protected String nume;
    protected String prenume;
    protected Integer varsta;
    protected Integer punctaj;
    protected Integer nrProiecte;
    protected String[] denumireProiect;

    public static void setPragPunctaj(Integer pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void afiseazaStatus() {
        System.out.println("Aplicantul " + nume + " " + prenume + (punctaj < pragPunctaj ? " nu" : "") + " a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(Integer punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setDenumiriProiecte(Integer nrProiecte, String[] denumiri) {
        this.nrProiecte = nrProiecte;
        denumireProiect = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            denumireProiect[i] = denumiri[i];
        }
    }

    public void afiseazaFinantarePeZi(Integer sumaPeZi) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste" + sumaPeZi + " Euro/zi in proiect.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}
