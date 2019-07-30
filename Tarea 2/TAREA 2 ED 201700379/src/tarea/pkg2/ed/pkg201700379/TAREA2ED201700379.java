
package tarea.pkg2.ed.pkg201700379;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TAREA2ED201700379 {

   
    public static void main(String[] args) {
        try {
            Lista Bolsa = new Lista();
            
            System.out.println("---- BOLSA LISTA CIRCULAR ----\n");
            
            //agregar datos al inicio
            Bolsa.agregarAlInicio(2603);
            Bolsa.agregarAlInicio(2586);
            Bolsa.agregarAlInicio(5603);
            Bolsa.agregarAlInicio(8926);
            //agregar elementos al final
            Bolsa.agregarAlFinal(1400);
            Bolsa.agregarAlFinal(2500);
            Bolsa.agregarAlFinal(0000);
            
            
            
            //MOSTAR LA LISTA
            System.out.println("<<-- Lista BOLSA -->>");
            Bolsa.Mostrar_Lista();
            
            //tamaño de la lista.
            System.out.println("TAMAÑO DE BOLSA");
            System.out.println(Bolsa.gettamaño());
            
            
            //obtener valor
            System.out.println("valor de bolsa posición: 3");
            System.out.println(Bolsa.getValor(3));
            System.out.println("valor de bolsa posición: 1");
            System.out.println(Bolsa.getValor(1));
            
            
            //buscar elemento
          System.out.println("Consulta si existe el valor bolsa 2061");
            System.out.println(Bolsa.buscar(2061));
            System.out.println("Consulta si existe el valor de bolsa 2500");
            System.out.println(Bolsa.buscar(2500));
            
            
            //la lista esta vacía
            System.out.println(" La bolsa esta vacía");
            System.out.println(Bolsa.esVacia());
            
        } catch (Exception ex) {
            Logger.getLogger(TAREA2ED201700379.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
        
        
        
    }
    
    
    
}
