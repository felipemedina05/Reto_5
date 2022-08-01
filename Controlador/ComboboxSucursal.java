
package Controlador;

import Modelo.*;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ComboboxSucursal {
    
    Connection connection ;
    Conexion conexion = new Conexion();
    Statement st ;
    ResultSet rs;

    public ComboboxSucursal() {
    }
    
  public ArrayList getListaSucursales(){
      System.out.println("Funcion getListaSucursales ()");
      ArrayList mListaSucursales = new ArrayList();
      Sucursal sucursal = null ;
      
      try{
          connection = conexion.getConnection();
          st = connection.createStatement();
          rs = st.executeQuery("SELECT idSucursal, nombreSucursal FROM sucursal;");
          while(rs.next()){
              sucursal = new Sucursal ();
              sucursal.setIdsucursal(rs.getInt("idSucursal"));
              sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
              mListaSucursales.add(sucursal);
          }
      }catch(SQLException e){
          System.out.println(e);
          
      }
  return mListaSucursales ;
          
  
}
}
