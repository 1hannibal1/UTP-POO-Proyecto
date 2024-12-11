package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Productos;
import modelo.ProductoManager;

public class Producto extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;
    private int selectedCodeProduct;

    public Producto() {
        initComponents();

        tableModel = new DefaultTableModel(new String[]{"Producto", "Precio", "Categoría", "Descripción"}, 0);
        tabla_productos.setModel(tableModel);

        for (Productos producto : ProductoManager.getProductos()) {
            tableModel.addRow(new Object[]{
                producto.getNombre(), producto.getPrecio(), producto.getCategoria(), producto.getDescripcion()
            });
        }
        
        tabla_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Producto.this.selectRowValues();
            }
        });
    }

    Producto(String string, String producto_1, double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void selectRowValues() {
        int selectedRow = tabla_productos.getSelectedRow(); // Obtén la fila seleccionada
                if (selectedRow != -1) {
                    // Obtén los valores de las columnas en la fila seleccionada
                    String nombre = tabla_productos.getValueAt(selectedRow, 0).toString();
                    String precio = tabla_productos.getValueAt(selectedRow, 1).toString();
                    String categoria = tabla_productos.getValueAt(selectedRow, 2).toString();
                    String descripcion = tabla_productos.getValueAt(selectedRow, 3).toString();
                    
                    this.selectedCodeProduct = ProductoManager.buscarProductoPorNombreYCategoria(nombre, categoria)
                            .getCodigo();
                    // Asigna los valores a los campos del formulario
                    txt_nombreProducto.setText(nombre);
                    txt_precioProducto.setText(precio);
                    txt_descripcionProducto.setText(descripcion);
                    cbox_categoriaProductos.setSelectedItem(categoria);
                }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1_imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1_actualizarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_precioProducto = new javax.swing.JTextField();
        jButton2_agregarProducto = new javax.swing.JButton();
        jButton1_regresarProductos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_descripcionProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbox_categoriaProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1_imagen.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Productos");
        jPanel1_imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_actualizarProducto.setBackground(new java.awt.Color(255, 204, 51));
        jButton1_actualizarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_actualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_actualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jButton1_actualizarProducto.setText("Actualizar");
        jButton1_actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_actualizarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_actualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 220, 30));
        jPanel1.add(txt_precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 220, 30));

        jButton2_agregarProducto.setBackground(new java.awt.Color(255, 204, 51));
        jButton2_agregarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_agregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_agregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jButton2_agregarProducto.setText("Agregar");
        jButton2_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_agregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_agregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 140, -1));

        jButton1_regresarProductos.setBackground(new java.awt.Color(255, 204, 51));
        jButton1_regresarProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_regresarProductos.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_regresarProductos.setText("Regresar");
        jButton1_regresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_regresarProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_regresarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descripción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txt_descripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_descripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Categoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 60, 20));

        cbox_categoriaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Pollo a la Brasa", "Piqueos", "Complementos", "Carnes y Parrillas" }));
        cbox_categoriaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_categoriaProductosActionPerformed(evt);
            }
        });
        jPanel1.add(cbox_categoriaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 32, 190, 30));

        jPanel1_imagen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 880, 210));

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

        jPanel1_imagen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 880, 430));

        getContentPane().add(jPanel1_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    private void jButton1_actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_actualizarProductoActionPerformed
        String nombreP = txt_nombreProducto.getText().trim();
        String description = txt_descripcionProducto.getText().trim();
        String category = (String) cbox_categoriaProductos.getSelectedItem();
        double precioP;
        if (nombreP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del producto no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            precioP = Double.parseDouble(txt_precioProducto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Productos updateProduct = 
                new Productos(selectedCodeProduct, nombreP, precioP, category, description);
        boolean validUpdateProduct = ProductoManager.updateProducto(updateProduct);
        if(validUpdateProduct){
            this.actualizarTabla();
        }
    }//GEN-LAST:event_jButton1_actualizarProductoActionPerformed

    private void jButton2_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_agregarProductoActionPerformed
        String nombreP = txt_nombreProducto.getText().trim();
        String description = txt_descripcionProducto.getText().trim();
        String category = (String) cbox_categoriaProductos.getSelectedItem();
        double precioP;
        if (nombreP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del producto no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            precioP = Double.parseDouble(txt_precioProducto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean exists = ProductoManager.getProductos().stream()
            .anyMatch(producto -> producto.getNombre().equalsIgnoreCase(nombreP) && 
                                  producto.getCategoria().equalsIgnoreCase(category));
        if (exists) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Ya existe un producto con el mismo nombre y categoría.", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Productos producto = new Productos((ProductoManager.getProductos().size() + 1), nombreP, precioP, category, description);
        ProductoManager.setProductos(producto);
        tableModel.addRow(new Object[]{
          producto.getNombre(), producto.getPrecio(), producto.getCategoria(), producto.getDescripcion()
        });
        JOptionPane.showMessageDialog(this, "Producto agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2_agregarProductoActionPerformed

    private void jButton1_regresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_regresarProductosActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1_regresarProductosActionPerformed

    private void txt_descripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionProductoActionPerformed

    private void cbox_categoriaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_categoriaProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_categoriaProductosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }
    
    public void limpiar(){
        txt_nombreProducto.setText("");
        txt_precioProducto.setText("");
        txt_descripcionProducto.setText("");
    }
    
    private void cargarTabla(){
        tableModel.setRowCount(0);
        for (Productos producto : ProductoManager.getProductos()) {
            tableModel.addRow(new Object[]{
                producto.getNombre(), producto.getPrecio(), producto.getCategoria(), producto.getDescripcion()
            });
        }
    }
    
    public void actualizarTabla(){
        this.limpiar();
        this.cargarTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_categoriaProductos;
    private javax.swing.JButton jButton1_actualizarProducto;
    private javax.swing.JButton jButton1_regresarProductos;
    private javax.swing.JButton jButton2_agregarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_imagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_descripcionProducto;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precioProducto;
    // End of variables declaration//GEN-END:variables

}
