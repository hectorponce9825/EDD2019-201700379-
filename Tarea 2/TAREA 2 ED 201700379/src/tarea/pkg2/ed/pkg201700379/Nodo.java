
package tarea.pkg2.ed.pkg201700379;

public class Nodo {
    //variable que guarda el valor 
    private int valor;
    
    private Nodo siguiente;
    
    //constructor
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
    
}
