package teste;

import static org.junit.Assert.*;

import classes.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;
    @Before
    public void setUp(){
        mate= new Matematica();
    }

    //in junit 3 metoda tb sa inceapa neaparat cu test
    //in junit4 ne folosim de adnotari. daca nu o pun va fi privita ca o metoda normala


//    @Test
//    public void test(){
//        fail("Not yet implemented");
//    }

    @Test
    public void testSumaCorecta(){
        //Matematica mate= new Matematica();
        int rezultat= mate.suma(5, 9);
        //asertia
        assertEquals("Metoda suma este gresita",14, rezultat);
    }

    @Test
    public void testRaportZecimalCorect(){
        //Matematica mate= new Matematica();
        double rezultat= mate.raport(27, 6);
        assertEquals(4.5, rezultat, 0.001);//param 3 e marja de eroare folosita pt nr reale

    }

    @Test
    public void testRaportShouldThrowException(){
        try {
            mate.raport(34, 0);
            fail("Nu trebuia sa ajunga aici");
        }catch(IllegalArgumentException exceptie ){

        }

    }

    @Test
    public void testEsteParCorect(){
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(18));
        assertTrue(mate.estePar(78));
        assertFalse(mate.estePar(5));
        assertFalse(mate.estePar(89));
    }

    @Test
    public void testNNrPareListNotNull(){
        List<Integer> lista= mate.nNumerePare(2);
        assertNotNull(lista);
    }

}