package es.uah.matcomp.ed.lineales.lista.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListadoblementeEnlazadaTest {

    @Test
    void isVacia() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        assertEquals(false,l1.isVacia(),"Fallo vacia no coincide");
    }

    @Test
    void vaciar() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.vaciar();
        assertEquals(true,l1.isVacia(),"Fallo vaciar no coincide");
    }

    @Test
    void add() {   //probar los ifs
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        ElementoLDE actual = l1.getElemento(0);
        assertEquals(10,actual.getData(),"Fallo add no coincide");

    }

    @Test
    void testAdd() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add("10");
        ElementoLDE actual = l1.getElemento(0);
        assertEquals("10",actual.getData(),"Fallo add no coincide");
    }

    @Test
    void insert() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.insert(12,2);
        ElementoLDE actual = l1.getElemento(2);
        assertEquals(12,actual.getData(),"Fallo add no coincide");
    }

    @Test
    void testInsert() {
    }

    @Test
    void del() {
    }

    @Test
    void getNumeroElementos() {
    }

    @Test
    void getPosicion() {
    }

    @Test
    void getPrimero() {
    }

    @Test
    void getUltimo() {
    }

    @Test
    void getAnterior() {
    }

    @Test
    void getElemento() {
    }
}