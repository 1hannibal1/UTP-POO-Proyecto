/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author carlo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1_IngresarVenta = new javax.swing.JButton();
        jButton2_Productos = new javax.swing.JButton();
        jButton3_Reportes = new javax.swing.JButton();
        jButton4_Usuarios = new javax.swing.JButton();
        jButton5_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1_IngresarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_IngresarVenta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1_IngresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_IngresarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        jButton1_IngresarVenta.setText("Ingresar Venta");
        jButton1_IngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_IngresarVentaActionPerformed(evt);
            }
        });

        jButton2_Productos.setBackground(new java.awt.Color(51, 140, 255));
        jButton2_Productos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_Productos.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jButton2_Productos.setText(" Productos");
        jButton2_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ProductosActionPerformed(evt);
            }
        });

        jButton3_Reportes.setBackground(new java.awt.Color(51, 140, 255));
        jButton3_Reportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_Reportes.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jButton3_Reportes.setText(" Reportes");
        jButton3_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_ReportesActionPerformed(evt);
            }
        });

        jButton4_Usuarios.setBackground(new java.awt.Color(51, 140, 255));
        jButton4_Usuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButton4_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jButton4_Usuarios.setText(" Usuarios");
        jButton4_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_UsuariosActionPerformed(evt);
            }
        });

        jButton5_Salir.setBackground(new java.awt.Color(0, 102, 102));
        jButton5_Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton5_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton5_Salir.setText(" Salir");
        jButton5_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_IngresarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jButton4_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_IngresarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton5_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 640, 440));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 140, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 500));

        jPanel3.setBackground(new java.awt.Color(51, 140, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jPanel4.setBackground(new java.awt.Color(51, 140, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 640, 30));

        jPanel5.setBackground(new java.awt.Color(51, 140, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 640, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_IngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_IngresarVentaActionPerformed
        IngresarVenta ingresarVenta = new IngresarVenta();
        ingresarVenta.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_IngresarVentaActionPerformed

    private void jButton5_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_SalirActionPerformed
        Login login = new Login();
        login.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton5_SalirActionPerformed

    private void jButton3_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_ReportesActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton3_ReportesActionPerformed

    private void jButton2_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ProductosActionPerformed
        Producto producto = new Producto();
        producto.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton2_ProductosActionPerformed

    private void jButton4_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_UsuariosActionPerformed
        Usuarios usuarios = new Usuarios();
        usuarios.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton4_UsuariosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_IngresarVenta;
    private javax.swing.JButton jButton2_Productos;
    private javax.swing.JButton jButton3_Reportes;
    private javax.swing.JButton jButton4_Usuarios;
    private javax.swing.JButton jButton5_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
