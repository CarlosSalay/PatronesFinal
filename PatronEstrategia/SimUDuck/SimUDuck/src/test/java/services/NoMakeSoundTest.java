package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NoMakeSoundTest {


    public NoMakeSound m;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        m = new NoMakeSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        m.makeSound();
        assertTrue(out.toString().toLowerCase().contains("no hago sonido"));
    }

    @Test
    public void testToString() {
        String esperado = "nomakesound{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}