package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {


    public FlyWithWings f;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        f = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        f.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }

    @Test
    public void testToString() {
        String esperado = "flywithwings{}";
        String obtenido = f.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}