package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {

    public DecoyDuck d;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato senuelo"));
    }

    @Test
    public void testSwim(){
        d.swmin();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}