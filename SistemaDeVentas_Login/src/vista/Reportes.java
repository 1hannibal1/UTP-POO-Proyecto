package vista;

import javax.swing.table.DefaultTableModel;
import modelo.ProductoManager;
import modelo.ProductoVenta;
import modelo.Productos;
import modelo.Venta;
import modelo.VentaManager;

public class Reportes extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;

    public Reportes() {
        initComponents();

        tableModel = new DefaultTableModel(new String[]{"Código", "Nombre", "Precio Unitario", "Cantidad", "Total"}, 0);
        tabla_Ventas.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Ventas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_codigoVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_FechaVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_direccionBoleta = new javax.swing.JTextField();
        txt_TelefonoVenta = new javax.swing.JTextField();
        txt_nombreVenta = new javax.swing.JTextField();
        txt_rucVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_pagoVenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1_regresarVenta = new javax.swing.JButton();
        jButton1_buscarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 140, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte de Venta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 240, 40));

        tabla_Ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_Ventas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 880, 420));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 110, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 30, -1));
        jPanel2.add(txt_codigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 25, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos del Cliente:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, -1));
        jPanel2.add(txt_FechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 65, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUC:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Documento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        txt_direccionBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionBoletaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_direccionBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 140, -1));

        txt_TelefonoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_TelefonoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, -1));

        txt_nombreVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nombreVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, -1));

        txt_rucVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rucVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rucVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total a Pagar:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 90, -1));
        jPanel2.add(txt_pagoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("¡Gracias por su compra!");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 250, 30));

        jButton1_regresarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_regresarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_regresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_regresarVenta.setText("Regresar");
        jButton1_regresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_regresarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_regresarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 120, 30));

        jButton1_buscarVenta.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_buscarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_buscarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_buscarVenta.setText("Buscar");
        jButton1_buscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_buscarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_buscarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rucVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rucVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rucVentaActionPerformed

    private void txt_TelefonoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoVentaActionPerformed

    private void txt_nombreVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreVentaActionPerformed

    private void txt_direccionBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionBoletaActionPerformed

    private void jButton1_regresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_regresarVentaActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_regresarVentaActionPerformed

    private void jButton1_buscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_buscarVentaActionPerformed
        int codigoVenta = Integer.parseInt(txt_codigoVenta.getText());
        for (Venta venta : VentaManager.getVenta()) {
            if (codigoVenta == venta.getCodigo()) {
                txt_nombreVenta.setText(venta.getNombreCliente());
                txt_direccionBoleta.setText(venta.getCodigoDocumento());
                txt_rucVenta.setText(venta.getRuc());
                txt_TelefonoVenta.setText(venta.getTelefono());
                txt_FechaVenta.setText(venta.getFechaRegistro());
                txt_pagoVenta.setText(venta.getCostoTotal() + "");
                double totalProducto;

                for (ProductoVenta productoVenta : venta.getProductos()) {
                    for (Productos producto : ProductoManager.getProductos()) {
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1_buscarVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reportes().setVisible(true);
        });
    }

    private void calcularTotal() {
        double total = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            total += (double) tableModel.getValueAt(i, 4);
        }
        txt_pagoVenta.setText(String.valueOf(total));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_buscarVenta;
    private javax.swing.JButton jButton1_regresarVenta;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Ventas;
    private javax.swing.JTextField txt_FechaVenta;
    private javax.swing.JTextField txt_TelefonoVenta;
    private javax.swing.JTextField txt_codigoVenta;
    private javax.swing.JTextField txt_direccionBoleta;
    private javax.swing.JTextField txt_nombreVenta;
    private javax.swing.JTextField txt_pagoVenta;
    private javax.swing.JTextField txt_rucVenta;
    // End of variables declaration//GEN-END:variables
}
