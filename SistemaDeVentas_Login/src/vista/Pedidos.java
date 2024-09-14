package vista;

import javax.swing.table.DefaultTableModel;
import modelo.ProductoManager;
import modelo.Productos;

public class Pedidos extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;

    public Pedidos() {
        initComponents();

        tableModel = new DefaultTableModel(new String[]{"Código", "Nombre", "Precio Unitario"}, 0);
        tabla_productos.setModel(tableModel);

        for (Productos producto : ProductoManager.getProductos()) {
            tableModel.addRow(new Object[]{
                producto.getCodigo(), producto.getNombre(), producto.getPrecio()
            });
        }
    }

    Pedidos(String string, String producto_1, double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1_imagen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Mesa 10");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, 60));

        jButton10.setBackground(new java.awt.Color(255, 204, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Mesa 1");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 60));

        jButton11.setBackground(new java.awt.Color(255, 204, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Mesa 1");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 60));

        jButton12.setBackground(new java.awt.Color(255, 204, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Mesa 7");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 60));

        jButton13.setBackground(new java.awt.Color(255, 204, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("Mesa 3");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 60));

        jButton14.setBackground(new java.awt.Color(255, 204, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("Mesa 4");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, 60));

        jButton15.setBackground(new java.awt.Color(255, 204, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("Mesa 8");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, 60));

        jButton16.setBackground(new java.awt.Color(255, 204, 0));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setText("Mesa 5");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 60));

        jButton17.setBackground(new java.awt.Color(255, 204, 0));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("Mesa 6");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 60));

        jButton18.setBackground(new java.awt.Color(255, 204, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("Mesa 9");
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 60));

        jButton19.setBackground(new java.awt.Color(255, 204, 0));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("Mesa 2");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 60));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 600, 100));

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jPanel1_imagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 680));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }
    
    public void limpiar(){
        txt_nombreProducto.setText("");
        txt_precioProducto.setText("");
        txt_codigoProductos.setText("");
    }
    
    public void actualizarTabla(){
        this.limpiar();
        tableModel.setRowCount(0);
        for (Productos producto : ProductoManager.getProductos()) {
            tableModel.addRow(new Object[]{
                producto.getCodigo(), producto.getNombre(), producto.getPrecio()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
