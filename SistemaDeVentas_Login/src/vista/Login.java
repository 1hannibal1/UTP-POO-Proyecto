package vista;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.PedidoTemp;
import modelo.PedidosManager;
import modelo.ProductoManager;
import modelo.Usuario;
import modelo.UsuarioManager;
import modelo.Usuarios.Cajero;
import modelo.Usuarios.Gerente;
import modelo.Usuarios.Mozo;
import modelo.VentaManager;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - SISTEMA DE VENTAS");
        this.setSize(new Dimension(400, 500));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton_IniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 41, -1));

        txt_clave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_claveKeyPressed(evt);
            }
        });
        getContentPane().add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 220, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 41, -1));

        jButton_IniciarSesion.setBackground(new java.awt.Color(255, 204, 51));
        jButton_IniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_IniciarSesion.setText("INGRESAR");
        jButton_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 179, 35));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 273));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 273));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_clave.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_claveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_txt_claveKeyPressed

    private void jButton_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarSesionActionPerformed
        this.Login();
    }//GEN-LAST:event_jButton_IniciarSesionActionPerformed

    public static void main(String args[]) {
        UsuarioManager.crearUsuario();
        ProductoManager.inicializarDatos();
        PedidosManager.inicializarDatos();
        //VentaManager.inicializarDatos();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        String usuario = txt_usuario.getText();
        String clave = new String(txt_clave.getPassword());
        
        //Usuario cajero = UsuarioManager.getCajero();
        //Usuario mozo = UsuarioManager.getMozo();
        //Usuario gerente = UsuarioManager.getGerente();
        
        /*Cajero cajero = (Cajero) UsuarioManager.getCajero();
        Mozo mozo = (Mozo) UsuarioManager.getMozo();
        Gerente gerente = (Gerente) UsuarioManager.getGerente();
        */
        Usuario usuarioActual = UsuarioManager.validarTipoUsuario(usuario, clave);
        if (usuarioActual != null) {
            JOptionPane.showMessageDialog(this,"BIENVENIDO " +usuarioActual.getNombre());
            
            if (usuarioActual instanceof Mozo) {
                MenuMozo menuMozo = new MenuMozo();
                menuMozo.setVisible(true);
                dispose();
            }else if (usuarioActual instanceof Cajero){
                MenuCajero menuCajero = new MenuCajero();
                menuCajero.setVisible(true);
                dispose();
            }else if (usuarioActual instanceof Gerente){
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }else {
                JOptionPane.showInternalMessageDialog(this,"Usuario desconocido","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
        
 
 
