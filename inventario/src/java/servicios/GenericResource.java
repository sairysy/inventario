
package Servicio.web;



import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.jboss.logging.Param;
import servicios.ServicioMonto;
import servicios.StockProducto;

/**
 * REST Web Service
 *
 * @author marcelosiedler
 
@Path("fazenda")
public class GenericResource {

  
   
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("StockProducto/list")
    public ArrayList<StockProducto> getXmls() throws Exception on)
    {
      ArrayList<StockProducto>lista=new ArrayList<StockProducto>();
      lista=StockProducto.stockproducto();
      return lista;
    }
*/
    /**
     *
     * @return
     * @throws Exception
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("ServioMonto/list")
    public ArrayList<ServicioMonto> getXmls() throws Exception on)
    {
      ArrayList<ServicioMonto>lista=new ArrayList<ServicioMonto>();
      lista=ServicioMonto.servicio_monto();
      return lista;
    }
 
    
}*/