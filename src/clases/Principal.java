package clases;

import javax.swing.UIManager;
import views.frmIndex;
import views.frmLogin;

public class Principal {

    
    public static void main(String[] args) {
          
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
