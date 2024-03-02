package es.uah.matcomp.ed.lineales.lista.simple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {
    private ListaEnlazada lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEnlazada();
    }

    @Test
    void isVacia() {
        assertTrue(lista.isVacia());
    }

    @Test
    void vaciar() {
        lista.add("Elemento");
        assertFalse(lista.isVacia());
        lista.vaciar();
        assertTrue(lista.isVacia());
    }

    @Test
    void add() {
        lista.add("Elemento");
        assertFalse(lista.isVacia());
        assertEquals(1, lista.getNumeroElementos());
    }

    @Test
    void testAdd() {
        lista.add(new ElementoLE("Elemento"));
        assertFalse(lista.isVacia());
        assertEquals(1, lista.getNumeroElementos());
    }

    @Test
    void insert() {
        lista.insert("Elemento", 0);
        assertFalse(lista.isVacia());
        assertEquals(1, lista.getNumeroElementos());
    }

    @Test
    void testInsert() {
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.insert("ElementoInsertado", 1);
        assertEquals("ElementoInsertado", lista.getElemento(1).getData());
        assertEquals(3, lista.getNumeroElementos());
    }

    @Test
    void del() {
        lista.add("Elemento");
        lista.del(0);
        assertTrue(lista.isVacia());
    }

    @Test
    void getNumeroElementos() {
        assertEquals(0, lista.getNumeroElementos());
        lista.add("Elemento");
        assertEquals(1, lista.getNumeroElementos());
    }

    @Test
    void getPosicion() {
        lista.add("Elemento1");
        lista.add("Elemento2");
        assertEquals(0, lista.getPosicion(lista.getElemento(0)));
        assertEquals(1, lista.getPosicion(lista.getElemento(1)));
    }

    @Test
    void getUltimo() {
        lista.add("Elemento1");
        lista.add("Elemento2");
        assertEquals("Elemento2", lista.getUltimo().getData());
    }

    @Test
    void getSiguiente() {
        ElementoLE primero = new ElementoLE("Elemento1");
        ElementoLE segundo = new ElementoLE("Elemento2");
        primero.setSiguiente(segundo);
        assertEquals(segundo, lista.getSiguiente(primero));
    }

    @Test
    void getElemento() {
        lista.add("Elemento1");
        lista.add("Elemento2");
        assertEquals("Elemento1", lista.getElemento(0).getData());
        assertEquals("Elemento2", lista.getElemento(1).getData());
    }
}
