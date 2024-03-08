package es.uah.matcomp.ed.lineales.lista.simple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {
    private ListaEnlazada lista;

    @Test
    void ListaEnlazada() {
        ListaEnlazada l1 = new ListaEnlazada();
        assertEquals(null, l1.getElemento(0));

        ElementoLE el1 = new ElementoLE(12);
        ListaEnlazada l2 = new ListaEnlazada(el1);

        assertEquals(el1, l2.getElemento(0));
    }

    @Test
    void isVacia() {
        ListaEnlazada l1 = new ListaEnlazada();
        assertTrue(l1.isVacia(), "Fallo: la lista debería estar vacía");
        ElementoLE el1 = new ElementoLE(1);
        l1.add(el1);
        assertFalse(l1.isVacia(), "Fallo: la lista no debería estar vacía");
    }

    @Test
    void vaciar() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE(1);
        l1.add(el1);
        l1.vaciar();
        assertTrue(l1.isVacia(), "Fallo: la lista debería estar vacía después de vaciarla");
    }

    @Test
    void add() {
        ListaEnlazada l1 = new ListaEnlazada();
        assertNull(l1.getElemento(0), "Fallo: la lista debería estar vacía al principio");
        ElementoLE el1 = new ElementoLE(1);
        l1.add(el1);
        assertEquals(1, l1.getElemento(0).getData(), "Fallo: el primer elemento no coincide");
        ElementoLE el2 = new ElementoLE(3);
        l1.add(el2);
        assertEquals(3, l1.getElemento(1).getData(), "Fallo: el segundo elemento no coincide");
    }

    @Test
    void testAdd() {
        ListaEnlazada l1 = new ListaEnlazada();
        l1.add("1");
        assertEquals("1", l1.getElemento(0).getData(), "Fallo: el primer elemento no coincide");
        l1.add(2);
        assertEquals(2, l1.getElemento(1).getData(), "Fallo: el segundo elemento no coincide");
    }

    @Test
    void insert() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE("10");
        l1.add(el1);

        ElementoLE el2 = new ElementoLE("15");
        l1.add(el2);

        ElementoLE el3 = new ElementoLE("20");
        l1.add(el3);

        ElementoLE el4 = new ElementoLE("12");

        l1.insert(el4, 1);
        ElementoLE actual = l1.getElemento(1);
        assertEquals(el4, actual, "Fallo: el elemento insertado no coincide");
    }

    @Test
    void testInsert() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE("1");
        l1.add(el1);

        ElementoLE el2 = new ElementoLE("2");
        l1.add(el2);

        ElementoLE el3 = new ElementoLE("3");
        l1.add(el3);

        l1.insert("20", 1);
        assertEquals("20", l1.getElemento(1).getData(), "Fallo: el elemento insertado no coincide");
    }

    @Test
    void del() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE("1");
        l1.add(el1);

        ElementoLE el2 = new ElementoLE("2");
        l1.add(el2);

        ElementoLE el3 = new ElementoLE("3");
        l1.add(el3);

        int actual1 = l1.del(1);
        assertEquals(1, actual1, "Fallo: el método de eliminación no coincide");

        ListaEnlazada l2 = new ListaEnlazada();
        ElementoLE el5 = new ElementoLE("5");
        l1.add(el5);

        int actual2 = l2.del(-1);
        assertEquals(-1, actual2, "Fallo: el método de eliminación no coincide");
    }

    @Test
    void getNumeroElementos() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE("5");
        l1.add(el1);

        ElementoLE el2 = new ElementoLE("3");
        l1.add(el2);

        ElementoLE el3 = new ElementoLE("2");
        l1.add(el3);

        assertEquals(3, l1.getNumeroElementos(), "Fallo: el número de elementos no coincide");
    }

    @Test
    void getPosicion() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE("10");
        l1.add(el1);

        ElementoLE el2 = new ElementoLE("15");
        l1.add(el2);

        ElementoLE el3 = new ElementoLE("20");
        l1.add(el3);

        ElementoLE el4 = new ElementoLE("25");

        assertEquals(0, l1.getPosicion(el1), "Fallo: la posición del primer elemento no coincide");
        assertEquals(-1, l1.getPosicion(el4), "Fallo: la posición de un elemento inexistente no coincide");
    }

    @Test
    void getUltimo() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE(10);
        l1.add(el1);

        ElementoLE el2 = new ElementoLE(15);
        l1.add(el2);

        ElementoLE el3 = new ElementoLE(20);
        l1.add(el3);

        ElementoLE actual = l1.getUltimo();

        assertEquals(el3, actual, "Fallo: el último elemento no coincide");
    }

    @Test
    void getSiguiente() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE(10);
        l1.add(el1);

        ElementoLE el2 = new ElementoLE(15);
        l1.add(el2);

        ElementoLE el3 = new ElementoLE(20);
        l1.add(el3);

        ElementoLE el4 = new ElementoLE(null);
        l1.add(el4);

        ElementoLE actual = l1.getElemento(0);
        assertEquals(el2, l1.getSiguiente(actual), "Fallo: el elemento siguiente no coincide");

        assertNull(l1.getSiguiente(el4), "Fallo: no debería haber un elemento siguiente para un elemento con valor nulo");
    }

    @Test
    void getElemento() {
        ListaEnlazada l1 = new ListaEnlazada();
        ElementoLE el1 = new ElementoLE(10);
        l1.add(el1);

        ElementoLE el2 = new ElementoLE(15);
        l1.add(el2);

        ElementoLE el3 = new ElementoLE(20);
        l1.add(el3);

        ElementoLE actual = l1.getElemento(1);

        assertEquals(el2, actual, "Fallo: el elemento obtenido no coincide");

        ListaEnlazada l2 = new ListaEnlazada();
        ElementoLE el5 = new ElementoLE(30);
        l2.add(el5);

        ElementoLE actual2 = l2.getElemento(-1);
        assertNull(actual2, "Fallo: no debería haber un elemento para un índice negativo");
    }
}

