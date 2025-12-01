package clases;

import javax.swing.UIManager;
import views.frmIndex;
import views.frmLogin;
import model.Conexion;

public class Principal {

    
    public static void main(String[] args) {
        
        //Testea la conexion con la base de datos
        Conexion testConexion = new Conexion();
        testConexion.establecerConexion();
          
        frmIndex objIndex = new frmIndex();
        frmLogin objLogin = new frmLogin();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
        
        objLogin.setVisible(true);
    }
    
}
