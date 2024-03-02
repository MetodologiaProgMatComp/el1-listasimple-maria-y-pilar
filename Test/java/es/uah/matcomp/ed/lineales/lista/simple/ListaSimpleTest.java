package es.uah.matcomp.ed.lineales.lista.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//REVISAR TEST, no pasa por getSiguiente
class ListaSimpleTest {    //Cambiar la forma de añadir elementos

    @Test
    void isVacia() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);
        assertEquals(false,l1.isVacia(),"Fallo vacia no coincide");

        ListaSimple l2 = new ListaSimple(5);
        assertEquals(true,l2.isVacia(),"Fallo vacia no coincide");

    }

    @Test
    void vaciar() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        l1.vaciar();
        assertEquals(true,l1.isVacia(),"Fallo vacia no coincide en vaciar");
    }

    @Test
    void add() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);
        ElementoLS actual= l1.getPrimero();

        assertEquals(el1,actual.getData(),"Fallo add no coincide");

        ListaSimple l2 = new ListaSimple(1);
        ElementoLS el3 = new ElementoLS();
        el3.setData("10");
        l2.add(el3);

        ElementoLS el4 = new ElementoLS();
        l2.add(el4);

        assertEquals(-1,l2.getPosicion(el4),"Fallo add no coincide");

    }

    @Test
    void testAdd() {
        ListaSimple l1 = new ListaSimple(5);
        l1.add("10");
        ElementoLS actual= l1.getPrimero();

        assertEquals("10",actual.getData(),"Fallo add no coincide");

    }

    @Test
    void insert() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        ElementoLS el4 =new ElementoLS();
        el4.setData("12");

        l1.insert(el4,1);
        ElementoLS actual=l1.getElemento(1);
        assertEquals(el4,actual.getData(),"Fallo insert no coincide");
    }

    @Test
    void testInsert() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        l1.insert("12",1);
        ElementoLS actual=l1.getElemento(1);
        assertEquals("12",actual.getData(),"Fallo insert no coincide");
    }

    @Test
    void del() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        int actual1 = l1.del(1);
        assertEquals(1,actual1,"Fallo del no coincide");

        ListaSimple l2 = new ListaSimple(5);
        ElementoLS el5 = new ElementoLS();
        el5.setData("10");
        l1.add(el5);

        int actual2 = l2.del(-1);
        assertEquals(-1,actual2,"Fallo del no coincide");
    }

    @Test
    void getNumeroElementos() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        assertEquals(3,l1.getNumeroElementos(),"Fallo numero elementos no coincide");
    }

    @Test
    void getPosicion() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        assertEquals(0,l1.getPosicion(el1),"Fallo posicion no coincide");

    }

    @Test
    void getPrimero() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        ElementoLS actual=l1.getPrimero();

        assertEquals(el1,actual.getData(),"Fallo primero no coincide");

    }

    @Test
    void getUltimo() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        ElementoLS actual=l1.getUltimo();

        assertEquals(el3,actual.getData(),"Fallo ultimo no coincide");

        ListaSimple l2 = new ListaSimple(5);
        ElementoLS actual2=l2.getUltimo();
        assertEquals(null,actual2,"Fallo ultimo no coincide");

    }

    @Test
    void getSiguiente(){   //Metodoprivado
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        int anterior= l1.getPosicion(el1);
        ElementoLS actual= l1.getElemento(anterior+1);

        assertEquals(el2,actual.getData(),"Fallo elemento no coincide en siguiente");
    }

    @Test
    void getElemento() {
        ListaSimple l1 = new ListaSimple(5);
        ElementoLS el1 = new ElementoLS();
        el1.setData("10");
        l1.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData("15");
        l1.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData("20");
        l1.add(el3);

        ElementoLS actual=l1.getElemento(1);

        assertEquals(el2,actual.getData(),"Fallo elemento no coincide");

        ListaSimple l2 = new ListaSimple(5);
        ElementoLS el5 = new ElementoLS();
        l2.add("30");
        ElementoLS actual2=l2.getElemento(-1);
        assertEquals(null,actual2,"Fallo elemento no coincide");
    }


}