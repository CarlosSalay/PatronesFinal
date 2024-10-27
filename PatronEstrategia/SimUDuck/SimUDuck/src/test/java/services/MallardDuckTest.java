package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MallardDuckTest {

    public MallardDuck d;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato silvestre"));
    }

    @Test
    public void testSwim(){
        d.swmin();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testFlyWithWings(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }

    @Test
    public void testMakeQuack(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }

    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}