package vista;

public class Usuarios extends javax.swing.JFrame {


    public Usuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1_agregarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_contarseñaUsuario = new javax.swing.JTextField();
        jComboBox2_TipoUsuario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_nombreUsuario1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 140, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_agregarUsuario.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_agregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_agregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_agregarUsuario.setText("Agregar");
        jButton1_agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_agregarUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1_agregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 40, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contarseña:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuevo Usuario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 30));

        txt_contarseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contarseñaUsuarioActionPerformed(evt);
            }
        });
        txt_contarseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contarseñaUsuarioKeyPressed(evt);
            }
        });
        jPanel3.add(txt_contarseñaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 160, 30));

        jComboBox2_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Administrador ", "Cajero", " ", " ", " " }));
        jComboBox2_TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2_TipoUsuarioActionPerformed(evt);
            }
        });
        jComboBox2_TipoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2_TipoUsuarioKeyPressed(evt);
            }
        });
        jPanel3.add(jComboBox2_TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 160, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 40, 50));

        txt_nombreUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreUsuario1ActionPerformed(evt);
            }
        });
        txt_nombreUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreUsuario1KeyPressed(evt);
            }
        });
        jPanel3.add(txt_nombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 450, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2_TipoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2_TipoUsuarioKeyPressed

    }//GEN-LAST:event_jComboBox2_TipoUsuarioKeyPressed

    private void jComboBox2_TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2_TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2_TipoUsuarioActionPerformed

    private void txt_contarseñaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contarseñaUsuarioKeyPressed

    }//GEN-LAST:event_txt_contarseñaUsuarioKeyPressed

    private void txt_contarseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contarseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contarseñaUsuarioActionPerformed

    private void jButton1_agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_agregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_agregarUsuarioActionPerformed

    private void txt_nombreUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreUsuario1ActionPerformed

    private void txt_nombreUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreUsuario1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreUsuario1KeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_agregarUsuario;
    private javax.swing.JComboBox<String> jComboBox2_TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_contarseñaUsuario;
    private javax.swing.JTextField txt_nombreUsuario1;
    // End of variables declaration//GEN-END:variables
}
