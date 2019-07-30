/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2.ed.pkg201700379;

/**
 *
 * @author Miguel
 */
public class Lista {
    //LEER
    //ingeniero puse cosas extras sacadas de internet pero es que las puse para analizarla en lo que iba entendiendo el código. :,v
    
    
  
    
    private Nodo inicio; //apuntador de inicio
    
    private Nodo ultimo; //apuntador final 
    
     private int tamaño;
     
     
     public void Lista(){
        inicio = null;
        ultimo = null;
        tamaño = 0;//la lista inicia en cero siempre
    }
     
     //verificar si la lista esta vacia
     public boolean esVacia(){
        return inicio == null;
    }
     
    public int gettamaño (){
        return tamaño;
    } 
     ////////-----////////-----////////-----////////-----////////-------
     ////////----- CONTENIDO EXTRA QUE SAQUÉ DE INTERNET XD-------//////
     ////////-----////////-----////////-----////////-----////////-------
     
     public void agregarAlFinal(int valor){
        
        Nodo nuevo = new Nodo(); //nuevo nodo
        nuevo.setValor(valor);
        
        if (esVacia()) {
                    inicio = nuevo;
                    ultimo = nuevo;
                    ultimo.setSiguiente(inicio);
       
        } else{
                    ultimo.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;
        }
        
        tamaño++;
    }
     
     
     public void agregarAlInicio(int valor){
      
        Nodo nuevo = new Nodo(); //nuevo nodo
       
        nuevo.setValor(valor); //inserta el valor
        
        if (esVacia()) { //si es vacía entonces se agrega al inicio de forma normal
                    inicio = nuevo;
                    ultimo = nuevo;  
                    ultimo.setSiguiente(inicio);
       
        } else{ //si no es vacía entonces cambía la posición de inicio 
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                    ultimo.setSiguiente(inicio);
        }
        
        tamaño++;
    }
     
      public void insertarPorReferencia(int referencia, int valor){
       
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
       
        if (!esVacia()) {
           
            if (buscar(referencia)) { //consulta si el valor coincide en la lista
                 Nodo aux = inicio; // valor auxiliar
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                                
                if (aux == ultimo) { //si va después del último
                        aux.setSiguiente(nuevo);
                        nuevo.setSiguiente(inicio);
                        ultimo = nuevo;
                } else {
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                
                tamaño++; //incrementa el contador de la lista. 
            }
        }      
    }
     
      public int getValor(int posicion) throws Exception{
       
        if(posicion>=0 && posicion<tamaño){//verifica que la posición exista en la lista. 
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                    return inicio.getValor();
            }else{
               
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                    return aux.getValor();
            }
        
        } else {
            throw new Exception("no existe la posición");
        }
    }
      
        public boolean buscar(int referencia){
        
        Nodo aux = inicio;
        
        boolean encontrado = false;
        //recorre la lista hasta encontrar el elemento 
        do{
            
            if (referencia == aux.getValor()){ //consulta
                    encontrado = true;
            }
            else{
                    aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
                    return encontrado;
    }  
      
     public void eliminar(){
        inicio = null;
        ultimo = null;
        tamaño = 0;
    }
     
     public void Seleccionar_Valor(){
        
     }
     
     public void Mostrar_Lista(){
        
        if (!esVacia()) {
           
            Nodo aux = inicio;
            
            int i = 0;
            System.out.print("---> ");
                        do{
                            System.out.println(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                            aux = aux.getSiguiente();
                            i++;
            }while(aux != inicio);
        }
    }
}
