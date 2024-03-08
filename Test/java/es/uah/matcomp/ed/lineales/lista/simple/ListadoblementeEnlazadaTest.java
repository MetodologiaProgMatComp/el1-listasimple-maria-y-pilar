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

        l1.add(null);
        assertNull(l1.getUltimo().getData(),"Fallo add no coincide");

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
        //Insertar en una posicion
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.insert(12,2);
        ElementoLDE actual = l1.getElemento(3);
        assertEquals(12,actual.getData(),"Fallo insert no coincide");
        l1.insert(12,4);
        ElementoLDE actual1 = l1.getUltimo();
        assertEquals(12,actual1.getData(),"Fallo insert no coincide");
    }

    @Test
    void testInsert() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.insert("12",2);
        ElementoLDE actual = l1.getElemento(3);
        assertEquals("12",actual.getData(),"Fallo insert no coincide");
        l1.insert("12",4);
        ElementoLDE actual1 = l1.getUltimo();
        assertEquals("12",actual1.getData(),"Fallo insert no coincide");
    }

    @Test
    void del() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        l1.add(10);
        l1.add(11);
        l1.add(13);
        l1.del(0);
        assertEquals(2,l1.getNumeroElementos(),"Fallo del no coincide");

        ListadoblementeEnlazada l2 = new ListadoblementeEnlazada();
        l2.add(10);
        l2.del(0);
        assertEquals(0,l2.getNumeroElementos(),"Fallo del no coincide");

        ListadoblementeEnlazada l3 = new ListadoblementeEnlazada();
        l3.add(10);
        l3.add(11);
        l3.add(13);
        l3.del(1);
        assertEquals(1,l3.getNumeroElementos(),"Fallo del no coincide");
        ListadoblementeEnlazada l4 = new ListadoblementeEnlazada();
        l4.add(10);
        assertEquals(-1,l4.del(-1),"Fallo del no coincide");
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
        ElementoLDE el2 = new ElementoLDE(11);
        assertEquals(-1,l1.getPosicion(el2),"Fallo posicion no coincide");
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
        ElementoLDE el2 = new ElementoLDE(20);
        ElementoLDE el3 = new ElementoLDE(30);

        el1.insertarmeEn(el2);
        el2.insertarmeEn(el3);

        assertEquals(el1, l1.getAnterior(el2), "El anterior no coincide");
        assertEquals(el2, l1.getAnterior(el3), "El anterior no coincide");
        assertNull(l1.getAnterior(el1), "El anterior no coincide");

        ListadoblementeEnlazada l2 = new ListadoblementeEnlazada();
        ElementoLDE el4= new ElementoLDE(null);
        assertEquals (null,l2.getAnterior(el4));
    }

    @Test
    void getsiguiente() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        ElementoLDE el1 = new ElementoLDE(10);
        ElementoLDE el2 = new ElementoLDE(20);
        ElementoLDE el3 = new ElementoLDE(30);

        el1.insertarmeEn(el2);
        el2.insertarmeEn(el3);

        assertEquals(el2, l1.getSiguiente(el1), "El siguiente de el1 debería ser el2");
        assertEquals(el3, l1.getSiguiente(el2), "El siguiente de el2 debería ser el3");
        assertNull(l1.getSiguiente(el3), "El siguiente de el3 debería ser nulo");
    }

    @Test
    void getElemento() {
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();
        ElementoLDE el1 = new ElementoLDE(10);
        l1.add(el1);
        assertEquals(el1,l1.getElemento(0).getData(),"Fallo elemento no coincide");
    }
}