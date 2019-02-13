/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

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
        ArrayList <StockProducto> lista=new ArrayList <StockProducto>();
        lista=StockProducto.stockproducto();
        if(lista.size()!=0)
        {
            for(StockProducto rec:lista)    {
                System.out.println(rec.getNombre());
             System.out.println(rec.getNombreproducto());
             System.out.println(rec.getStock());
            }
        }else {
    System.out.print("No hay registro");
         }
       
    }
    
    
}
