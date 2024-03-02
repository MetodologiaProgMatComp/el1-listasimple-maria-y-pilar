package es.uah.matcomp.ed.lineales.lista.simple;

public class ElementoLDE {
    private ElementoLDE anterior;
    private ElementoLDE siguiente;
    private Object data;

    public ElementoLDE (Object data){
        this.data=data;
    }

    protected void insertarmeEn(ElementoLDE el){
        this.siguiente=el.siguiente;
        this.anterior=el;

        if (el.siguiente !=null){
            el.siguiente.anterior=this;
        }
        el.siguiente=this;
    }
    protected ElementoLDE getSiguiente(){
        return this.siguiente;
    }
    protected ElementoLDE getAnterior(){
        return this.anterior;
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
