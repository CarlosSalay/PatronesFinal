package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MakeQuackTest {


    public MakeQuack m;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        m = new MakeQuack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        m.makeSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }

    @Test
    public void testToString() {
        String esperado = "makequack{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}