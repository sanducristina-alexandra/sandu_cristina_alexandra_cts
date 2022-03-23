package seminar2;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAn_studii(int an_studii) {
        this.anStudii = an_studii;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Student ");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudii=").append(anStudii);
        sb.append('}');
        return sb.toString();
    }
}
