/**
 * Programa principal de prueba
 */
import es.uah.matcomp.ed.lineales.lista.simple.ListaSimple;
import es.uah.matcomp.ed.lineales.lista.simple.ElementoLS;
//GENERA ERROR AL EJECUTAR
public class MainListaSimple {
    public static void main(String[] args){
        ListaSimple l = new ListaSimple(5);

        //Primero hay que crear el elemento
        ElementoLS el1 = new ElementoLS();
        el1.setData(10);
        l.add(el1);

        ElementoLS el2 = new ElementoLS();
        el2.setData(15);
        l.add(el2);

        ElementoLS el3 = new ElementoLS();
        el3.setData(20);
        l.add(el3);

        System.out.println("Número de elementos en la lista: " + l.getNumeroElementos());

        ElementoLS primero = l.getPrimero();
        ElementoLS ultimo = l.getUltimo();

        // Imprimiendo los datos del primer y último elemento
        System.out.println("Primer elemento: " + primero.getData());
        System.out.println("Último elemento: " + ultimo.getData());


        ElementoLS elemento = l.getElemento(1);
        System.out.println("Elemento en la poscicion 1"+elemento.getData());

    }
}
