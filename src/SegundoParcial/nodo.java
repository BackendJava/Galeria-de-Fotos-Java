package SegundoParcial;

public class nodo {

    private imagen i1 = new imagen();
    private nodo siguiente;
    private nodo anterior;

    public imagen getI1() {
        return i1;
    }

    public void setI1(imagen i1) {
        this.i1 = i1;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }
}
