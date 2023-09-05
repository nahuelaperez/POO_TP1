package ar.edu.unlu.poo.lista;

public class Nodo {

    private Object dato;

    private Nodo proximo = null;


    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setProximo(Nodo nodo) {
        this.proximo = nodo;
    }


    public Nodo getProximo() {
        return proximo;
    }


}
