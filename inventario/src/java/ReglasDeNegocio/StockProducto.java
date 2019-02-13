
package ReglasDeNegocio;

import AccesoADatos.Conexion;
import AccesoADatos.Global;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.google.gson.Gson;

public class StockProducto {
       private int productoid;    
        private String nombre;        
        private String nombreproducto;        
        private int stock ;  

    public StockProducto() {
    }

    public StockProducto(int productoid, String nombre, String nombreproducto, int stock) {
        this.productoid = productoid;
        this.nombre = nombre;
        this.nombreproducto = nombreproducto;
        this.stock = stock;
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
 
        public static ArrayList<StockProducto> stockproducto() throws Exception
        {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<StockProducto> lista= new ArrayList<StockProducto>();
          StockProducto obj= new StockProducto();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.stock_productos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new StockProducto();
              obj.setProductoid(rs.getInt("pproductoid"));
              obj.setNombre(rs.getString("pnombre"));
              obj.setNombreproducto(rs.getString("pnombreproducto"));
              obj.setStock(rs.getInt("pstock"));              
             
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

    public static String  servicio_psjson() throws Exception
    {
        ArrayList<StockProducto> lista= new ArrayList<StockProducto>();
       lista= stockproducto();
       
    Gson gson = new Gson();
    StringBuilder sb = new StringBuilder();
    for(StockProducto d : lista) {
        sb.append(gson.toJson(d));
    }
    return sb.toString();
}
    
}
