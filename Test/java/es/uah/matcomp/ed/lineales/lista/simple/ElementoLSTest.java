package es.uah.matcomp.ed.lineales.lista.simple;

import static org.junit.jupiter.api.Assertions.*;

class ElementoLSTest {

    @org.junit.jupiter.api.Test
    void getData() {
        ElementoLS el1= new ElementoLS();
        assertEquals(null,el1.getData(),"Fallo data no coincide");
    }

    @org.junit.jupiter.api.Test
    void setData() {
        ElementoLS el1= new ElementoLS();
        el1.setData(10);
        assertEquals(10,el1.getData(),"Fallo data no coincide en el set");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        ElementoLS el1= new ElementoLS();
        el1.setData(10);
        assertEquals("10",el1.toString(),"Fallo toString no coincide");
    }
}