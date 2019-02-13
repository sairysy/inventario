/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio.web;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import ReglasDeNegocio.*;
import java.util.ArrayList;
/**
 * REST Web Service
 *
 * @author Cristian
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
   @Path("StockProducto/list")
    public ArrayList<StockProducto> getXmls() throws Exception {
        //TODO return proper representation object
        ArrayList<StockProducto> lista=new ArrayList<StockProducto>();
        lista=StockProducto.stockproducto();
        return lista;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("ServicioMonto/list")
    public ArrayList<ServicioMonto> getXmlc() throws Exception {
        //TODO return proper representation object
        ArrayList<ServicioMonto> lista=new ArrayList<ServicioMonto>();
        lista=ServicioMonto.servicio_monto();
        return lista;
    }
  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("ServicioCantidad/list")
    public ArrayList<ServicioCantidad> getXmla() throws Exception {
        //TODO return proper representation object
        ArrayList<ServicioCantidad> lista=new ArrayList<ServicioCantidad>();
        lista=ServicioCantidad.servicio_cantidad();
        return lista;
    }
    
     @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
