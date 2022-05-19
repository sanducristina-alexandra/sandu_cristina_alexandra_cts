package Teste;

import Clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSexPersoanaTest {

    @org.junit.Test
    public void getSex(){
        Persoana persoanaNoua = new Persoana("Stanescu","1946666388591");
        assertEquals("M",persoanaNoua.getSex());
    }

    @Test
    public void bounderyGetSex(){
        Persoana persoana1 = new Persoana("Stanescu","3913777299216");
        Persoana persoana2 = new Persoana("Stanescu","6213777299216");

        assertEquals("M",persoana1.getSex());
        assertEquals("F",persoana2.getSex());
    }

    @Test
    public void crossCheckGetSex(){
        Persoana pers = new Persoana("Stanescu","2913777299216");
        assertEquals(pers.CNP.charAt(0)%2==1?"M":"F",pers.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorCheckGetSex(){
        Persoana pers = new Persoana("Stanescu","0913777299216");
        pers.getSex();
    }

    @Test(timeout = 100)
    public void performanceTestGetSex(){
        Persoana pers = new Persoana("Stanescu","3913777299216");
        pers.getSex();
    }

    @Test
    public void formatCheckGetSex(){
        Persoana pers1 = new Persoana("Stanescu","1913777299216");
        Persoana pers2 = new Persoana("Stanescu","2913777299216");

        assertEquals("M",pers1.getSex());
        assertEquals("F",pers2.getSex());
    }

    @Test
    public void rangeCheckGetSex(){
        Persoana pers = new Persoana("Stanescu","7913777299216");
        assertEquals("N/A",pers.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceCheckGetSex(){
        Persoana pers = new Persoana("Stanescu",null);
        pers.getSex();
    }


}