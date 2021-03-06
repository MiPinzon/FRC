package model;


import model.inicio;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import model.baseDatos;

public class login extends javax.swing.JFrame {

    baseDatos conn = new baseDatos();
    public String usuario;
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        IN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        advertencia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 156, 18));

        Titulo.setBackground(new java.awt.Color(255, 153, 0));
        Titulo.setFont(new java.awt.Font("Coolvetica Compressed Hv", 1, 48)); // NOI18N
        Titulo.setText("   Fitness Routine Companion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        IN.setFont(new java.awt.Font("Coolvetica Compressed Hv", 1, 36)); // NOI18N
        IN.setText("Iniciar Sesión");
        Fondo.add(IN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Coolvetica Compressed Hv", 1, 24)); // NOI18N
        jLabel1.setText("Correo");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Correo.setForeground(new java.awt.Color(204, 204, 204));
        Correo.setText("Ingrese su correo");
        Correo.setBorder(null);
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CorreoMousePressed(evt);
            }
        });
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        Fondo.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, 10));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Coolvetica Compressed Hv", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 270, 10));

        Contraseña.setText("jPasswordField1");
        Contraseña.setBorder(null);
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñaMousePressed(evt);
            }
        });
        Fondo.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 270, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Registrarse");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 113, 20));

        Inicio.setBackground(new java.awt.Color(255, 255, 255));

        LoginText.setBackground(new java.awt.Color(0, 0, 0));
        LoginText.setFont(new java.awt.Font("Coolvetica Compressed Hv", 1, 24)); // NOI18N
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("Inicio");
        LoginText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Fondo.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        advertencia.setForeground(new java.awt.Color(255, 0, 0));
        Fondo.add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewapp/frc.png"))); // NOI18N
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 260, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMousePressed
        Correo.setText("");
        Correo.setForeground(Color.BLACK);
    }//GEN-LAST:event_CorreoMousePressed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMousePressed
        Contraseña.setText("");
        Contraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_ContraseñaMousePressed

    private void LoginTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginTextMouseEntered
        Inicio.setBackground(Color.orange);
    }//GEN-LAST:event_LoginTextMouseEntered

    private void LoginTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginTextMouseExited
        Inicio.setBackground(Color.WHITE);
    }//GEN-LAST:event_LoginTextMouseExited

    private void LoginTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginTextMousePressed
        Connection cn = conn.conexion();
        usuario = Correo.getText();
        if(conn.entranda(conn.conexion(), Correo.getText(), String.valueOf(Contraseña.getPassword()))){
            inicio Sl = new inicio();
            Sl.setVisible(true);
            dispose();
            
            System.out.println("El correo y el usuario estan");
            
        }else{
            advertencia.setText("El usuario y/o contraseña no coincide");
        }

    }//GEN-LAST:event_LoginTextMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        registroUsuario s1 = new registroUsuario();
        s1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MousePressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel IN;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel advertencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
