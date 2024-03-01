package es.uah.matcomp.ed.lineales.lista.simple;

public class ElementoLDE {
    private ElementoLDE anterior;
    private ElementoLDE siguiente;
    private Object data;

    private void insertarmeEn(ElementoLDE el){
        if (el!=null){
            this.anterior=el;
            //this.siguiente= getSiguiente(el);

            //if (getSiguiente(el)!= null){
                anterior=this;
            }


    }
    private void getSiguiente(ElementoLDE el){

    }
    private void getAnterior(ElementoLDE el){

    }
    public Object getData(){
        return this.data;
    }
    public Object setData(Object o){
        Object temporal = data;
        data=o;
        return temporal;
    }
}
