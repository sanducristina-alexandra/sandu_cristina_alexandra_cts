package Teste;

import Clase.Persoana;
import Exceptii.ExceptieCNPGresit;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaPersoanaTest {

    @org.junit.Test
    public void getVarsta(){
        Persoana persoana = new Persoana("Sandu","6001003394429");
        assertEquals(21,persoana.getVarsta());
    }

    @Test
    public void bouderysupGetVarsta(){
        Persoana persoana = new Persoana("Sandu","3000101394429");
        assertEquals(222,persoana.getVarsta());
    }
    @Test
    public void bouderyinfGetVarsta(){
        Persoana persoana1 = new Persoana("Sandu","6220101394429");
        assertEquals(0,persoana1.getVarsta());
    }

    @Test(expected = ExceptieCNPGresit.class)
    public void errorTestGetVarsta(){
        Persoana persoana = new Persoana("Sandu","6250101394429");
        persoana.getVarsta();
    }

    @Test(expected = NumberFormatException.class)
    public void erroralfTestGetVarsta(){
        Persoana persoana = new Persoana("Sandu","62dshhd139429");
        persoana.getVarsta();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void errorCNPinvalidGetVarsta(){
        Persoana persoana = new Persoana("Sandu","600");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void performanceGetVarsta(){
        Persoana persoana1 = new Persoana("Sandu","6210101394429");
        persoana1.getVarsta();
    }

    @Test
    public void orderefTestGetVarsta(){
        Persoana persoana1 = new Persoana("Sandu","1981003394429");
        Persoana persoana2 = new Persoana("Simion","6001003394429");
        assertTrue(persoana1.getVarsta()> persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void existanceGetVarsta(){
        Persoana persoana1 = new Persoana("Sandu",null);
        persoana1.getVarsta();
    }

}