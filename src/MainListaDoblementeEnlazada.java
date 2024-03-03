import es.uah.matcomp.ed.lineales.lista.simple.ElementoLDE;
import es.uah.matcomp.ed.lineales.lista.simple.ListadoblementeEnlazada;
public class MainListaDoblementeEnlazada { //NO FUNCIONA BIEN
    public static void main (String[] args){
        ListadoblementeEnlazada l1 = new ListadoblementeEnlazada();

        // Agregar elementos a la lista
        l1.add("10");
        l1.add("15");
        l1.add("20");
        System.out.println("Numero de elementos de la lista:" + l1.getNumeroElementos());

        // Insertar un elemento en la posición 1
        l1.insert("12", 1);

        // Imprimir información sobre la lista
        System.out.println("Numero de elementos de la lista tras insertar:" + l1.getNumeroElementos());
        ElementoLDE p = l1.getPrimero();
        ElementoLDE u = l1.getUltimo();
        ElementoLDE e = l1.getElemento(2);
        System.out.println("Primer elemento:" + p.getData());
        System.out.println("Ultimo elemento:" + u.getData());
        System.out.println("Elemento en la posicion 1:" + e.getData());

        // Eliminar un elemento de la lista
        l1.del(2);

        // Info actualizada
        System.out.println("Numero de elementos de la lista tras eliminar:" + l1.getNumeroElementos());
    }
}
