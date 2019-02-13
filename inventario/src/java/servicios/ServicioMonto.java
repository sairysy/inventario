
package servicios;

import AccesoADatos.Conexion;
import AccesoADatos.Global;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ServicioMonto {
        private int productoid;    
        private String nombrecategoria;        
        private String nombreproducto;        
        private double montoprodcompados;           
        private double montoprodvendidos;

    public ServicioMonto() {
    }

    public ServicioMonto(int productoid, String nombrecategoria, String nombreproducto, double montoprodcompados, double montoprodvendidos) {
        this.productoid = productoid;
        this.nombrecategoria = nombrecategoria;
        this.nombreproducto = nombreproducto;
        this.montoprodcompados = montoprodcompados;
        this.montoprodvendidos = montoprodvendidos;
    }

    /**
     * @return the productoid
     */
    public int getProductoid() {
        return productoid;
    }

    /**
     * @param productoid the productoid to set
     */
    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    /**
     * @return the nombrecategoria
     */
    public String getNombrecategoria() {
        return nombrecategoria;
    }

    /**
     * @param nombrecategoria the nombrecategoria to set
     */
    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    /**
     * @return the nombreproducto
     */
    public String getNombreproducto() {
        return nombreproducto;
    }

    /**
     * @param nombreproducto the nombreproducto to set
     */
    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    /**
     * @return the montoprodcompados
     */
    public double getMontoprodcompados() {
        return montoprodcompados;
    }

    /**
     * @param montoprodcompados the montoprodcompados to set
     */
    public void setMontoprodcompados(double montoprodcompados) {
        this.montoprodcompados = montoprodcompados;
    }

    /**
     * @return the montoprodvendidos
     */
    public double getMontoprodvendidos() {
        return montoprodvendidos;
    }

    /**
     * @param montoprodvendidos the montoprodvendidos to set
     */
    public void setMontoprodvendidos(double montoprodvendidos) {
        this.montoprodvendidos = montoprodvendidos;
    }
        
        public static ArrayList<ServicioMonto> servicio_monto() throws Exception
        {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<ServicioMonto> lista= new ArrayList<ServicioMonto>();
          ServicioMonto obj= new ServicioMonto();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.mordenes_vs_mventas()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new ServicioMonto();
              obj.setProductoid(rs.getInt("pproductoid"));
              obj.setNombrecategoria(rs.getString("pnombrecategoria"));
              obj.setNombreproducto(rs.getString("pnombreproducto"));
              obj.setMontoprodcompados(rs.getInt("pmontoprodcomprados"));              
              obj.setMontoprodvendidos(rs.getInt("pmontoprodvendidos"));
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return lista;

    }

    
    
}
