    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Login extends javax.swing.JFrame {
    

    FondoPanel fondo = new FondoPanel();
    public Login() {
        this.setContentPane(fondo);
        initComponents();
        txtpswd.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpswd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(650, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 5, -1, -1));

        txtid.setToolTipText("");
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 50));

        txtpswd.setText("jPasswordField1");
        txtpswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpswdActionPerformed(evt);
            }
        });
        getContentPane().add(txtpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 111, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Iniciar Sesion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        getContentPane().add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, 40));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDOBLANCO.JPG"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(950, 440));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 330, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
            String user=txtid.getText();
            String Pswd=new String(txtpswd.getPassword());
            acceder (user,Pswd);

    }//GEN-LAST:event_btningresarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
            txtid.requestFocus();
    }//GEN-LAST:event_txtidActionPerformed

    private void txtpswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpswdActionPerformed
        txtpswd.requestFocus();
    }//GEN-LAST:event_txtpswdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    protected static javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpswd;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel{
    private Image imagen; 
    @Override
    public void paint (Graphics g)
    {   
      imagen = new ImageIcon(getClass().getResource("/imagenes/fondos.jpg")).getImage();   
      g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
      setOpaque(false);
      super.paint(g);
      
    }
}
void acceder (String id,String pswd) {
    String capturar = "",Nombre = "",turno="";
    String sql="SELECT * FROM estudiantes WHERE id='"+id+"' && contraseña='"+pswd+"'";   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
             capturar=rs.getString("tipo");
             Nombre=rs.getString("Nombre");
             turno=rs.getString("Turno");
            }
            if (capturar.equals("Est")){
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null," Bienvenido: "+Nombre);
                Estudiantes ingreso = new Estudiantes();
                ingreso.setVisible(true);
                ingreso.pack();
                Estudiantes.lblnombre.setText(Nombre);
                Estudiantes.lblcontrol.setText(id);
               
            }
            if (capturar.equals("rc")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null," Bienvenido: "+Nombre);
                Recepcionista ingreso = new Recepcionista();
                ingreso.setVisible(true);
                ingreso.pack();  
                Recepcionista.lblnombre.setText(Nombre);
                Recepcionista.lblturno.setText(turno);
            
            }
            if ((!capturar.equals("Est"))&&(!capturar.equals("rc"))) 
            {
             acceder1(id,pswd);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
}
void acceder1 (String id,String pswd) {
    String capturar = "",Nombre = "",turno="";
    String sql="SELECT * FROM recepcionista WHERE id='"+id+"' && contraseña='"+pswd+"'";   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
             capturar=rs.getString("tipo");
             Nombre=rs.getString("Nombre");
             turno=rs.getString("Turno");
            }
            if (capturar.equals("Est")){
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null," Bienvenido: "+Nombre);
                Estudiantes ingreso = new Estudiantes();
                ingreso.setVisible(true);
                ingreso.pack();
                Estudiantes.lblnombre.setText(Nombre);
                Estudiantes.lblcontrol.setText(id);
            }
            if (capturar.equals("rc")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null," Bienvenido: "+Nombre);
                Recepcionista ingreso = new Recepcionista();
                ingreso.setVisible(true);
                ingreso.pack();  
                Recepcionista.lblnombre.setText(Nombre);
                Recepcionista.lblturno.setText(turno);
            
            }
            if ((!capturar.equals("Est"))&&(!capturar.equals("rc"))) 
            {
               accederA(id,pswd);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
}
void accederA (String id,String pswd){
  String capturar = "",Nombre = "",turno="";
    String sql="SELECT * FROM administrador WHERE id='"+id+"' && contraseña='"+pswd+"'";   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
             capturar=rs.getString("tipo");
             Nombre=rs.getString("Nombre");
            }
            if (capturar.equals("ad")){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null," Bienvenido: "+Nombre);
                administrador ingreso = new administrador();
                ingreso.setVisible(true);
                ingreso.pack();  
                administrador.lblnombre.setText(Nombre);
            }
            if ((!capturar.equals("ad"))) 
            {
                JOptionPane.showMessageDialog(null,"no se encontro Resultados");
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }



}
//conexion a la base de datos 
Conectar cc = new Conectar();
Connection cn = cc.conexion();
}
