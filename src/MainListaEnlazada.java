import es.uah.matcomp.ed.lineales.lista.simple.ListaEnlazada;
import es.uah.matcomp.ed.lineales.lista.simple.ElementoLE;
public class MainListaEnlazada {
    public static void main(String[] args) {
        // Crear una lista enlazada vacía
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar elementos a la lista
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        // Imprimir la lista
        System.out.println("Contenido de la lista:");
        imprimirLista(lista);

        // Insertar un elemento en la posición 1
        lista.insert("Java", 1);
        System.out.println("\nDespués de insertar 'Java' en la posición 1:");
        imprimirLista(lista);

        // Eliminar el elemento en la posición 2
        lista.del(2);
        System.out.println("\nDespués de eliminar el elemento en la posición 2:");
        imprimirLista(lista);

        // Obtener el número de elementos en la lista
        System.out.println("\nNúmero de elementos en la lista: " + lista.getNumeroElementos());

        // Obtener la posición del elemento "Mundo"
        ElementoLE mundo = lista.getElemento(1); // "Mundo" está en la posición 1
        System.out.println("Posición de 'Mundo' en la lista: " + lista.getPosicion(mundo));

        // Obtener el primer elemento de la lista
        System.out.println("Primer elemento de la lista: " + lista.getElemento(0).getData());

        // Obtener el último elemento de la lista
        System.out.println("Último elemento de la lista: " + lista.getUltimo().getData());
    }

    // Método auxiliar para imprimir el contenido de la lista
    private static void imprimirLista(ListaEnlazada lista) {
        ElementoLE actual = lista.getElemento(0);
        while (actual != null) {
            System.out.print(actual.getData() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}
