package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ConcreteObserverTest {

    private ConcreteSubject mockSubject;
    private ConcreteObserver observer;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        mockSubject = mock(ConcreteSubject.class);
        observer = new ConcreteObserver(mockSubject);
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        mockSubject = null;
        observer = null;
        System.setOut(System.out);
    }

    @Test
    public void update() {
        when(mockSubject.getState()).thenReturn("Nuevo Estado");
        observer.update(mockSubject, null);
        verify(mockSubject).getState();
        assertTrue(out.toString().toLowerCase().contains("estado actualizado a: nuevo estado"));
    }

    @Test
    public void testToString() {
        when(mockSubject.getState()).thenReturn("Estado Actual");
        String esperado = "concreteobserver observando: estado actual";
        String obtenido = observer.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
