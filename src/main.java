/**
 * Programa principal de prueba
 */
import es.uah.matcomp.ed.lineales.lista.simple.*;

public class main {
    public static void main(String[] s){
        ListaSimple l = new ListaSimple(5);

        l.add("Primer elemento");
        l.add("Segundo elemento");
        ElementoLS elemento = l.getElemento(1);
        System.out.println(elemento.getData());
        System.out.println("Datos detallados");
        System.out.println(elemento);
        l.add("entre el primero y el segundo",1);

    }
}
