
package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

   
    public static void main(String[] args) {
        
    Conexion conexiondb = new Conexion ();
    conexiondb.getConnection();
    
        
    Login login = new Login();
    
    login.setVisible(true);
    
    
    
    
    }
    
}
