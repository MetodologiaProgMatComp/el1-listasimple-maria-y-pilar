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
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.insert("12",2);
        ElementoLDE actual = l1.getElemento(2);
        assertEquals("12",actual.getData(),"Fallo add no coincide");
    }

    @Test
    void del() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.del(2);
        assertEquals(2,l1.getNumeroElementos(),"Fallo del no coincide");
    }

    @Test
    void getNumeroElementos() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        assertEquals(3,l1.getNumeroElementos(),"Fallo numero de elementos no coincide");
    }

    @Test
    void getPosicion() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        ElementoLDE el1= new ElementoLDE(10);
        l1.add(el1);

        assertEquals(0,l1.getPosicion(el1),"Fallo posicion no coincide");
    }

    @Test
    void getPrimero() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        assertEquals(10,l1.getPrimero().getData(),"Fallo primero no coincide");
    }

    @Test
    void getUltimo() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        assertEquals(13,l1.getUltimo().getData(),"Fallo primero no coincide");
    }

    @Test
    void getAnterior() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        ElementoLDE el1 = new ElementoLDE(10);
        ElementoLDE el2 = new ElementoLDE(11);
        ElementoLDE el3 = new ElementoLDE(13);
        l1.add(el1);
        l1.add(el2);
        l1.add(el3);
        assertEquals(el2,l1.getAnterior(el3),"Fallo anterior no coincide");
    }

    @Test
    void getElemento() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        ElementoLDE el1 = new ElementoLDE(10);
        l1.add(el1);
        assertEquals(el1,l1.getElemento(0).getData(),"Fallo elemento no coincide");
    }
}