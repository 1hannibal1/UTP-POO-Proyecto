package vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Pedidos;

public class Reportes extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;

    public Reportes() {
        initComponents();
        tableModel = new DefaultTableModel(new String[]{"Unidades", "Pedido", "Precio"}, 0);
        tableReporte.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1_imagen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1_regresarProductos = new javax.swing.JButton();
        BtnMesa10 = new javax.swing.JButton();
        BtnMesa01 = new javax.swing.JButton();
        BtnMesa02 = new javax.swing.JButton();
        BtnMesa03 = new javax.swing.JButton();
        BtnMesa04 = new javax.swing.JButton();
        BtnMesa05 = new javax.swing.JButton();
        BtnMesa06 = new javax.swing.JButton();
        BtnMesa07 = new javax.swing.JButton();
        BtnMesa08 = new javax.swing.JButton();
        BtnMesa09 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReporte = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_regresarProductos.setBackground(new java.awt.Color(204, 204, 204));
        jButton1_regresarProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_regresarProductos.setText("Regresar");
        jButton1_regresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_regresarProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_regresarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 140, 40));

        BtnMesa10.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa10.setText("MESA 10");
        BtnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa10ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 150, 70));

        BtnMesa01.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa01.setText("MESA 01");
        BtnMesa01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa01ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 70));

        BtnMesa02.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa02.setText("MESA 02");
        BtnMesa02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa02ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 70));

        BtnMesa03.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa03.setText("MESA 03");
        BtnMesa03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa03ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa03, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 70));

        BtnMesa04.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa04.setText("MESA 04");
        BtnMesa04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa04ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, 70));

        BtnMesa05.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa05.setText("MESA 05");
        BtnMesa05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa05ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa05, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 150, 70));

        BtnMesa06.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa06.setText("MESA 06");
        BtnMesa06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa06ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa06, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, 70));

        BtnMesa07.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa07.setText("MESA 07");
        BtnMesa07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa07ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa07, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 70));

        BtnMesa08.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa08.setText("MESA 08");
        BtnMesa08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa08ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa08, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 150, 70));

        BtnMesa09.setBackground(new java.awt.Color(255, 204, 0));
        BtnMesa09.setText("MESA 09");
        BtnMesa09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa09ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesa09, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 150, 70));

        tableReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidades", "Pedido", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 370));

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setText("Total:");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 110, -1));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Reporte de Venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 180, 30));

        jPanel1_imagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 600));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMesa04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa04ActionPerformed
        
    }//GEN-LAST:event_BtnMesa04ActionPerformed


    private void BtnMesa07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa07ActionPerformed
        
    }//GEN-LAST:event_BtnMesa07ActionPerformed

    private void BtnMesa02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa02ActionPerformed
        

    }//GEN-LAST:event_BtnMesa02ActionPerformed

    private void BtnMesa01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa01ActionPerformed
        
    }//GEN-LAST:event_BtnMesa01ActionPerformed

    private void jButton1_regresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_regresarProductosActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_regresarProductosActionPerformed

    private void BtnMesa03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa03ActionPerformed
        
    }//GEN-LAST:event_BtnMesa03ActionPerformed

    private void BtnMesa05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa05ActionPerformed
        

    }//GEN-LAST:event_BtnMesa05ActionPerformed

    private void BtnMesa06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa06ActionPerformed
        
    }//GEN-LAST:event_BtnMesa06ActionPerformed

    private void BtnMesa08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa08ActionPerformed
        
    }//GEN-LAST:event_BtnMesa08ActionPerformed

    private void BtnMesa09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa09ActionPerformed
        
    }//GEN-LAST:event_BtnMesa09ActionPerformed

    private void BtnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa10ActionPerformed
        
    }//GEN-LAST:event_BtnMesa10ActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    private void cargarTabla(ArrayList<Pedidos> listaPedido) {
        tableModel.setRowCount(0);
        for (Pedidos pedido : listaPedido) {
            System.out.println(pedido);
            //tableModel.addRow(new Object[]{
              //  pedido.getCantidad(), pedido.getProduct(), pedido.getNumeroMesa()
            //});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMesa01;
    private javax.swing.JButton BtnMesa02;
    private javax.swing.JButton BtnMesa03;
    private javax.swing.JButton BtnMesa04;
    private javax.swing.JButton BtnMesa05;
    private javax.swing.JButton BtnMesa06;
    private javax.swing.JButton BtnMesa07;
    private javax.swing.JButton BtnMesa08;
    private javax.swing.JButton BtnMesa09;
    private javax.swing.JButton BtnMesa10;
    private javax.swing.JButton jButton1_regresarProductos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReporte;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
