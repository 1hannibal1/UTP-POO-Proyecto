package vista;

import javax.swing.ButtonGroup;
import modelo.PedidoTemp;
import modelo.Pedidos;
import modelo.PedidosManager;
import modelo.ProductoManager;
import modelo.Productos;
import modelo.VentaManager;
import modelo.Ventas;

public class vVentas extends javax.swing.JFrame {

    public vVentas() {
        initComponents();

        ButtonGroup group = new ButtonGroup();
        group.add(rdButtonBoleta);
        group.add(rdButtonFactura);
    }

    vVentas(String string, String producto_1, double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1_imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        btnModificarP = new javax.swing.JButton();
        rdButtonBoleta = new javax.swing.JRadioButton();
        rdButtonFactura = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTlelefono = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA");
        jPanel1_imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 300, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscar.setText("Preparar Pedido");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 220, 50));

        txtCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 380, 30));

        btnModificarP.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificarP.setText("Modificar Pedido");
        btnModificarP.setBorder(null);
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 220, 50));

        rdButtonBoleta.setBackground(new java.awt.Color(255, 255, 255));
        rdButtonBoleta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdButtonBoleta.setText("BOLETA");
        jPanel1.add(rdButtonBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, -1));

        rdButtonFactura.setBackground(new java.awt.Color(255, 255, 255));
        rdButtonFactura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdButtonFactura.setText("FACTURA");
        jPanel1.add(rdButtonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DNI / RUC:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 380, 30));

        txtDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 380, 30));

        txtTlelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txtTlelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTlelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTlelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 380, 30));

        jPanel1_imagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 630, 430));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdButtonBoletaActionPerformed(java.awt.event.ActionEvent evt) {
        // Aquí va el código que deseas ejecutar al hacer clic en el botón
    }

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        vPedidos pedidos = new vPedidos();
        pedidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int maxPedido = 0;
        for (Pedidos pedidos : PedidosManager.getPedidos()) {
            if (maxPedido < pedidos.getCodPedido()) {
                maxPedido = pedidos.getCodPedido();
            }
        }
        double total = 0.0;
        for (Pedidos pedidoTemp : PedidoTemp.getPedidos()) {
            int codigo = PedidosManager.getPedidos().size() + 1;
            double precioUnitario = 0;
            for (Productos productos : ProductoManager.getProductos()) {
                if (productos.getCodigo() == pedidoTemp.getCodProducto()) {
                    precioUnitario = productos.getPrecio();
                    break;
                }
            }
            total += precioUnitario * pedidoTemp.getCantidad();
            PedidosManager.setPedidos(new Pedidos(
                    codigo, maxPedido + 1, pedidoTemp.getCodProducto(),
                    pedidoTemp.getCantidad(), pedidoTemp.getCodMesa()));
        }

        String tipoVenta = "";
        if (rdButtonBoleta.isSelected()) {
            tipoVenta = "Boleta";
        } else if (rdButtonFactura.isSelected()) {
            tipoVenta = "Factura";
        } else {
            System.out.println("No se seleccionó ninguna opción");
        }
        String cliente = txtCliente.getText();
        String documento = txtDocumento.getText();
        String direccion = txtDireccion.getText();
        int teledono = Integer.parseInt(txtTlelefono.getText());
        int codigoVenta = VentaManager.getVentas().size() + 1;
        VentaManager.setVentas(new Ventas(codigoVenta, maxPedido + 1, tipoVenta, cliente, documento, direccion, teledono, total));
        PedidoTemp.limpiarLista();
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTlelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTlelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTlelefonoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificarP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JRadioButton rdButtonBoleta;
    private javax.swing.JRadioButton rdButtonFactura;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtTlelefono;
    // End of variables declaration//GEN-END:variables

}
