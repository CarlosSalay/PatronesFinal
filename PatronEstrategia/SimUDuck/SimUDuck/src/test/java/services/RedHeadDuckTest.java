package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedHeadDuckTest {

    public RedHeadDuck d;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new RedHeadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato de cabeza roja"));
    }

    @Test
    public void testSwim(){
        d.swmin();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testToString() {
        String esperado = "redheadduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}