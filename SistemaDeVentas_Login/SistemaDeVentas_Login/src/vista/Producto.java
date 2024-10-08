/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author carlo
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    public Producto() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1_imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1_Buscar = new javax.swing.JButton();
        jButton1_actualizarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigoProductos = new javax.swing.JTextField();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_precioProducto = new javax.swing.JTextField();
        jButton2_agregarProducto = new javax.swing.JButton();
        jButton1_regresarProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(51, 140, 255));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Productos");
        jPanel1_imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_Buscar.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_Buscar.setText("Buscar");
        jPanel1.add(jButton1_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 30));

        jButton1_actualizarProducto.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_actualizarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_actualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_actualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jButton1_actualizarProducto.setText("Actualizar");
        jButton1_actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_actualizarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_actualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        txt_codigoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoProductosActionPerformed(evt);
            }
        });
        jPanel1.add(txt_codigoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, 30));

        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, 30));
        jPanel1.add(txt_precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 210, 30));

        jButton2_agregarProducto.setBackground(new java.awt.Color(51, 140, 255));
        jButton2_agregarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_agregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_agregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jButton2_agregarProducto.setText("Agregar");
        jPanel1.add(jButton2_agregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 140, -1));

        jButton1_regresarProductos.setBackground(new java.awt.Color(51, 140, 255));
        jButton1_regresarProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_regresarProductos.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_regresarProductos.setText("Regresar");
        jPanel1.add(jButton1_regresarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 110, 30));

        jPanel1_imagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 880, 170));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabla_productos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_productos);

        jPanel1_imagen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 880, 470));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    private void txt_codigoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoProductosActionPerformed

    private void jButton1_actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_actualizarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_actualizarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Buscar;
    private javax.swing.JButton jButton1_actualizarProducto;
    private javax.swing.JButton jButton1_regresarProductos;
    private javax.swing.JButton jButton2_agregarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_codigoProductos;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precioProducto;
    // End of variables declaration//GEN-END:variables
}
