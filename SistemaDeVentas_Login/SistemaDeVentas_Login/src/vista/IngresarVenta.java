package vista;

import java.time.LocalDate;

public class IngresarVenta extends javax.swing.JFrame {

    public IngresarVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel1_imagen = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Fecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_documentoVenta = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_nombreVenta = new javax.swing.JTextField();
        txt_rucVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_pagoVenta = new javax.swing.JTextField();
        jButton1_EjecutarVenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1_ProductosVenta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1_tipo1 = new javax.swing.JComboBox<>();
        txt_TelefonoVenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1_RegresarVenta = new javax.swing.JButton();
        jButton1_AgregarVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1_Venta = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(51, 140, 255));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 140, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 240, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Productos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 70, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 110, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos del Cliente:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, -1));

        txt_Fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Fecha.setEnabled(false);
        txt_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FechaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUC:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        txt_documentoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_documentoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, -1));

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel2.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 140, -1));

        txt_nombreVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nombreVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, -1));

        txt_rucVenta.setEnabled(false);
        txt_rucVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rucVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rucVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total a Pagar:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 90, -1));
        jPanel2.add(txt_pagoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 130, -1));

        jButton1_EjecutarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_EjecutarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_EjecutarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_EjecutarVenta.setText("Ejecutar");
        jButton1_EjecutarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EjecutarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_EjecutarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 320, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 60, -1));

        jComboBox1_ProductosVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", " " }));
        jComboBox1_ProductosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_ProductosVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1_ProductosVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tipo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 55, 75, -1));

        jComboBox1_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", " " }));
        jComboBox1_tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_tipo1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1_tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 110, -1));

        txt_TelefonoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_TelefonoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 140, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Documento:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jButton1_RegresarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_RegresarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_RegresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_RegresarVenta.setText("Regresar");
        jButton1_RegresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_RegresarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_RegresarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 120, 30));

        jButton1_AgregarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_AgregarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_AgregarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_AgregarVenta.setText("Agregar");
        jButton1_AgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_AgregarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_AgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 120, 30));

        jTable1_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1_Venta);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 880, -1));

        jPanel1_imagen.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_documentoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_documentoVentaActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_nombreVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreVentaActionPerformed

    private void txt_rucVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rucVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rucVentaActionPerformed

    private void jButton1_EjecutarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EjecutarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_EjecutarVentaActionPerformed

    private void txt_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FechaActionPerformed

    private void jComboBox1_ProductosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_ProductosVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_ProductosVentaActionPerformed

    private void jComboBox1_tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_tipo1ActionPerformed

    private void txt_TelefonoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoVentaActionPerformed

    private void jButton1_RegresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_RegresarVentaActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1_RegresarVentaActionPerformed

    private void jButton1_AgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_AgregarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_AgregarVentaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVenta().setVisible(true);
                LocalDate fechaActual = LocalDate.now();
                
                
                System.out.println("La fecha actual es: " + fechaActual);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_AgregarVenta;
    private javax.swing.JButton jButton1_EjecutarVenta;
    private javax.swing.JButton jButton1_RegresarVenta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JComboBox<String> jComboBox1_ProductosVenta;
    private javax.swing.JComboBox<String> jComboBox1_tipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_Venta;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_TelefonoVenta;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_documentoVenta;
    private javax.swing.JTextField txt_nombreVenta;
    private javax.swing.JTextField txt_pagoVenta;
    private javax.swing.JTextField txt_rucVenta;
    // End of variables declaration//GEN-END:variables
}
