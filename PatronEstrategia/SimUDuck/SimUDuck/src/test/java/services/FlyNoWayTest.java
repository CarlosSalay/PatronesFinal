package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNoWayTest {


    public FlyNoWay f;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        f = new FlyNoWay();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        f.fly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }

    @Test
    public void testToString() {
        String esperado = "flynoway{}";
        String obtenido = f.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}