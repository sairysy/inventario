/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import ReglasDeNegocio.ServicioCantidad;
import java.util.ArrayList;

/**
 *
 * @author ESCUELA
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws Exception {
        ArrayList <ServicioCantidad> lista=new ArrayList <ServicioCantidad>();
        lista=ServicioCantidad.servicio_cantidad();
        if(lista.size()!=0)
        {
            for(ServicioCantidad rec:lista)    {
                System.out.println(rec.getNombre());
             System.out.println(rec.getNombreproducto());
             System.out.println(rec.getCantidadprodcomprados());
             System.out.println(rec.getCantidadprodvendidos());
            }
        }else {
    System.out.print("No hay registro");
         }
       
    }
    
    
}
