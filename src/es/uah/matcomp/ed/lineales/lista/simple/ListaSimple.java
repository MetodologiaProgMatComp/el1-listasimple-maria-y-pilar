package es.uah.matcomp.ed.lineales.lista.simple;

/**
 * Programar la lista simplemente enlazada.
 */
public class ListaSimple {
    private ElementoLS[] datos;
    private int maximo;
    public ListaSimple(int maximo){
        this.maximo=maximo;
        datos=new ElementoLS[maximo];
    }
    public boolean isVacia(){
        for (int i=0;i<maximo-1;i++){
            if (datos[i]!=null){
                return false;
            }
        }
        return true;
    }
    public void vaciar(){
        if (!isVacia()){
            for (int i=0;i<maximo-1;i++){
                datos[i]=null;
            }
        }
    }
    private int add(ElementoLS el){
        if (!isVacia()) {
            for (int i=0;i<maximo-1;i++){
                if (datos[i]==null){   //Hay una posición libre
                    datos[i]=el;
                    return i;
                }
            }
        }
        return 0; //0 indica que la lista está llena
    }
    public void add(String s){
        ElementoLS el=new ElementoLS(); //Creo nuevo elemento
        el.setData(s);
        add(el);  //Agrego
    }
    public void add(Object o){
        ElementoLS el=new ElementoLS(); //Creo nuevo elemento
        el.setData(o);
        add(el);  //Agrego
    }
    public void insert(Object o, int posicion) {
        if ((posicion >= 0) && (posicion < maximo-1)) {  //Posicion valida
            ElementoLS el=new ElementoLS(); //Creo nuevo elemento
            el.setData(o);
            datos[posicion] = el;  //Insertar elemento
        }
    }
    public void insert(String s, int posicion) {
        if((posicion > 0) && (posicion < maximo-1)) {  //Posicion valida
            ElementoLS el=new ElementoLS(); //Creo nuevo elemento
            el.setData(s);
            datos[posicion] = el;  //Insertar elemento
        }
    }
    public int del(int posicion) {
        if ((posicion > 0) && (posicion < maximo-1)) {  //Posicion valida
            datos[posicion] = null;
            return 1;
        }
        return 0;  //Indica error
    }
    public int getNumeroElementos() {
        int cont = 0;
        for (int i = 0; i < maximo-1; i++) {
            if (datos[i] != null) {
                cont++;
            }
        }
        return cont;
    }
    public int getPosicion(ElementoLS el) {
        for (int i = 0; i < maximo-1; i++) {
            if (datos[i] == el) {
                return i;
            }
        }
        return 0; //Error
    }
    public ElementoLS getPrimero() {  //DUDAAS
        return datos[0];
    }
    public ElementoLS getUltimo() {  //DUDAAS
        int fin= datos.length-1;
        return datos[fin];
    }
    private ElementoLS getSiguiente(ElementoLS el) {
        int posicion = getPosicion(el);
        if ((posicion >= 0) && (posicion < maximo-1)) {
            return datos[posicion + 1];
        }
        return null;
    }
    public ElementoLS getElemento(int posicion) {
        if ((posicion >= 0) && (posicion < maximo-1)) {
            return datos[posicion];
        }
        return null; //No hay
    }
}


